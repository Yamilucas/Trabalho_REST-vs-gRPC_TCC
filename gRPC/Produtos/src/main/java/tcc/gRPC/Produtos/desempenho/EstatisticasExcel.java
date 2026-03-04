package tcc.gRPC.Produtos.desempenho;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Component
public class EstatisticasExcel {

    private Workbook planilha;
    private Sheet aba;
    private int numeroLinhaAtual = 1;
    private final String nomeArquivo;
    private final Lock lock = new ReentrantLock();

    public EstatisticasExcel() {
        String dataHora = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss"));
        this.nomeArquivo = "estatisticas_desempenho_" + dataHora + ".xlsx";
        inicializarArquivo();
    }

    private void inicializarArquivo() {
        planilha = new XSSFWorkbook();
        aba = planilha.createSheet("Estatísticas");

        // Cabeçalho
        Row cabecalho = aba.createRow(0);
        String[] colunas = {
                "Data/Hora", "Tipo Operação",
                "Média Tempo (ms)", "Maior Tempo (ms)", "Menor Tempo (ms)", "Soma Tempo (ms)", "Quantidade Tempos",
                "Média Tamanho (bytes)", "Maior Tamanho (bytes)", "Menor Tamanho (bytes)", "Soma Tamanho (bytes)", "Quantidade Tamanhos"
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

    public void registrarEstatisticas(String tipoOperacao, List<Double> tempos, List<Integer> tamanhos) {
        lock.lock();
        try {
            Row linha = aba.createRow(numeroLinhaAtual++);

            String dataHora = LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

            // Calcular estatísticas de tempo
            double mediaTempo = tempos.stream().mapToDouble(Double::doubleValue).average().orElse(0);
            double maiorTempo = tempos.stream().mapToDouble(Double::doubleValue).max().orElse(0);
            double menorTempo = tempos.stream().mapToDouble(Double::doubleValue).min().orElse(0);
            double somaTempo = tempos.stream().mapToDouble(Double::doubleValue).sum();
            long quantiaTempos = tempos.size();

            // Calcular estatísticas de tamanho
            double mediaTamanho = tamanhos.stream().mapToInt(Integer::intValue).average().orElse(0);
            int maiorTamanho = tamanhos.stream().mapToInt(Integer::intValue).max().orElse(0);
            int menorTamanho = tamanhos.stream().mapToInt(Integer::intValue).min().orElse(0);
            int somaTamanho = tamanhos.stream().mapToInt(Integer::intValue).sum();
            long quantiaTamanhos = tamanhos.size();

            // Preencher a linha
            linha.createCell(0).setCellValue(dataHora);
            linha.createCell(1).setCellValue(tipoOperacao);
            linha.createCell(2).setCellValue(mediaTempo);
            linha.createCell(3).setCellValue(maiorTempo);
            linha.createCell(4).setCellValue(menorTempo);
            linha.createCell(5).setCellValue(somaTempo);
            linha.createCell(6).setCellValue(quantiaTempos);
            linha.createCell(7).setCellValue(mediaTamanho);
            linha.createCell(8).setCellValue(maiorTamanho);
            linha.createCell(9).setCellValue(menorTamanho);
            linha.createCell(10).setCellValue(somaTamanho);
            linha.createCell(11).setCellValue(quantiaTamanhos);

            // Escrever no arquivo
            try (FileOutputStream arquivoSaida = new FileOutputStream(nomeArquivo)) {
                planilha.write(arquivoSaida);
            } catch (IOException e) {
                System.err.println("Erro ao gravar estatísticas no Excel: " + e.getMessage());
            }
        } finally {
            lock.unlock();
        }
    }
}