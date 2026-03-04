package tcc.gRPC.Produtos.desempenho;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Component
public class MedidorDesempenhoIndividual {

    private Workbook planilha;
    private Sheet aba;
    private int numeroLinhaAtual = 1;
    private final String nomeArquivo;
    private final Lock lock = new ReentrantLock();

    public MedidorDesempenhoIndividual() {
        String dataHora = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss"));
        this.nomeArquivo = "metricas_individuais_produtos_" + dataHora + ".xlsx";
        inicializarArquivo();
    }

    private void inicializarArquivo() {
        planilha = new XSSFWorkbook();
        aba = planilha.createSheet("Metricas_Individuais");

        // Cabeçalho
        Row cabecalho = aba.createRow(0);
        String[] colunas = {
                "Data/Hora", "Método HTTP", "Endpoint", "Duração (ms)",
                "Registros no Banco", "Tamanho da Resposta (bytes)"
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
                               long registrosBanco, int tamanhoRespostaBytes) {
        lock.lock();
        try {
            Row linha = aba.createRow(numeroLinhaAtual++);

            String dataHora = LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

            linha.createCell(0).setCellValue(dataHora);
            linha.createCell(1).setCellValue(metodo);
            linha.createCell(2).setCellValue(endpoint);
            linha.createCell(3).setCellValue(duracaoMs);
            linha.createCell(4).setCellValue(registrosBanco);
            linha.createCell(5).setCellValue(tamanhoRespostaBytes);

            try (FileOutputStream arquivoSaida = new FileOutputStream(nomeArquivo)) {
                planilha.write(arquivoSaida);
            } catch (IOException e) {
                System.err.println("Erro ao gravar no Excel (GravadorCompleto): " + e.getMessage());
            }
        } finally {
            lock.unlock();
        }
    }
}