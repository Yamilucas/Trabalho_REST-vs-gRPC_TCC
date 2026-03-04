package tcc.gRPC.Produtos.desempenho;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Component
public class GravadorDesempenho {

    private Workbook planilha;
    private Sheet aba;
    private int numeroLinhaAtual = 1; // 0 é cabeçalho
    private final String nomeArquivo;
    private final Lock lock = new ReentrantLock();

    public GravadorDesempenho() {
        String medicao_tempo = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss"));
        this.nomeArquivo = "tempos_execucao_gRPC_" + medicao_tempo + ".xlsx";
        inicializarArquivo();
    }

    private void inicializarArquivo() {
        planilha = new XSSFWorkbook();
        aba = planilha.createSheet("Desempenho");

        // Cabeçalho
        Row cabecalho = aba.createRow(0);
        String[] colunas = {
                "Data/Hora", "Método HTTP", "Endpoint", "Duração (ms)",
                "Registros no Banco"
        };

        for (int i = 0; i < colunas.length; i++) {
            Cell celula = cabecalho.createCell(i);
            celula.setCellValue(colunas[i]);

            CellStyle estilo = planilha.createCellStyle();
            Font fonte = planilha.createFont();
            fonte.setBold(true);
            estilo.setFont(fonte);

            celula.setCellStyle(estilo);
        }
    }

    public void registrarTempo(String metodo, String endpoint, double duracaoMs,
                               long registrosBanco) {
        lock.lock();
        try {
            Row linha = aba.createRow(numeroLinhaAtual++);

            String medicao_tempo = LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

            linha.createCell(0).setCellValue(medicao_tempo);
            linha.createCell(1).setCellValue(metodo);
            linha.createCell(2).setCellValue(endpoint);
            linha.createCell(3).setCellValue(duracaoMs);
            linha.createCell(4).setCellValue(registrosBanco);

            try (FileOutputStream arquivoSaida = new FileOutputStream(nomeArquivo)) {
                planilha.write(arquivoSaida);
            } catch (IOException e) {
                System.err.println("Erro ao gravar no Excel: " + e.getMessage());
            }
        } finally {
            lock.unlock();
        }
    }
}
