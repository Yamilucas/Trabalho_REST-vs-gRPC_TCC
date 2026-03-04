package tcc.APIREST.Produtos.servicos;

import com.fasterxml.jackson.databind.ObjectMapper;
import tcc.APIREST.Produtos.desempenho.EstatisticasExcel;
import tcc.APIREST.Produtos.desempenho.MedidorDesempenhoIndividual;
import tcc.APIREST.Produtos.exceptions.ProdutoExceptionREST;
import tcc.APIREST.Produtos.mensagens.Mensagens;
import tcc.APIREST.Produtos.model.Produto;
import tcc.APIREST.Produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private MedidorDesempenhoIndividual desempenhoIndividual;

    @Autowired
    private EstatisticasExcel estatisticasExcel;

    @Autowired
    private ObjectMapper objectMapper;

    //Operações individuais

    public Produto criarProdutoIndividual(Produto produto) {
        try {
            long tempoInicio = System.nanoTime();

            Produto produtoSalvo = produtoRepository.save(produto);

            long duracaoNano = System.nanoTime() - tempoInicio;
            double duracaoMs = duracaoNano / 1_000_000.0;

            byte[] produtoBytes = objectMapper.writeValueAsBytes(produtoSalvo);
            int tamanhoResposta = produtoBytes.length;

            desempenhoIndividual.registrarTempo(
                    "POST",
                    "/api/produtos",
                    duracaoMs,
                    produtoRepository.count(),
                    tamanhoResposta
            );

            return produtoSalvo;
        } catch (Exception e) {
            throw new ProdutoExceptionREST(
                    String.format(Mensagens.ERRO_CRIAR_PRODUTO, e.getMessage()),
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }
    public Produto updateProduto(Long id, Produto produto) {
        try {
            Produto produtoExistente = produtoRepository.findById(id)
                    .orElseThrow(() -> new ProdutoExceptionREST(
                            String.format(Mensagens.PRODUTO_NAO_ENCONTRADO_COM_ID, id),
                            HttpStatus.NOT_FOUND
                    ));

            produtoExistente.setNome(produto.getNome());
            produtoExistente.setQuantidade(produto.getQuantidade());
            produtoExistente.setValor(produto.getValor());

            long tempoInicio = System.nanoTime();
            Produto produtoAtualizado = produtoRepository.save(produtoExistente);
            long duracaoNano = System.nanoTime() - tempoInicio;
            double duracaoMs = duracaoNano / 1_000_000.0;

            // Medir tamanho da resposta
            byte[] produtoBytes = objectMapper.writeValueAsBytes(produtoAtualizado);
            int tamanhoResposta = produtoBytes.length;

            desempenhoIndividual.registrarTempo(
                    "PUT",
                    "/api/produtos/" + id,
                    duracaoMs,
                    produtoRepository.count(),
                    tamanhoResposta
            );

            return produtoAtualizado;
        } catch (ProdutoExceptionREST e) {
            throw e;
        } catch (Exception e) {
            throw new ProdutoExceptionREST(
                    String.format(Mensagens.ERRO_ATUALIZAR_PRODUTO, e.getMessage()),
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }



    public Produto buscarPorId(Long id) {
        try {
            long tempoInicio = System.nanoTime();

            Produto produto = produtoRepository.findById(id)
                    .orElseThrow(() -> new ProdutoExceptionREST(
                            String.format(Mensagens.PRODUTO_NAO_ENCONTRADO_COM_ID, id),
                            HttpStatus.NOT_FOUND
                    ));

            long duracaoNano = System.nanoTime() - tempoInicio;
            double duracaoMs = duracaoNano / 1_000_000.0;

            byte[] produtoBytes = objectMapper.writeValueAsBytes(produto);
            int tamanhoResposta = produtoBytes.length;

            // Registrar métrica individual
            desempenhoIndividual.registrarTempo(
                    "GET",
                    "/api/produtos/" + id,
                    duracaoMs,
                    produtoRepository.count(),
                    tamanhoResposta
            );

            return produto;
        } catch (ProdutoExceptionREST e) {
            throw e;
        } catch (Exception e) {
            throw new ProdutoExceptionREST(
                    String.format(Mensagens.ERRO_BUSCAR_PRODUTO, e.getMessage()),
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }

    public String deletarPorId(Long id) {
        try {
            long tempoInicio = System.nanoTime();

            Produto produto = produtoRepository.findById(id)
                    .orElseThrow(() -> new ProdutoExceptionREST(
                            String.format(Mensagens.PRODUTO_NAO_ENCONTRADO_DELETAR, id),
                            HttpStatus.NOT_FOUND
                    ));

            produtoRepository.delete(produto);

            long duracaoNano = System.nanoTime() - tempoInicio;
            double duracaoMs = duracaoNano / 1_000_000.0;

            desempenhoIndividual.registrarTempo(
                    "DELETE",
                    "/api/produtos/" + id,
                    duracaoMs,
                    produtoRepository.count(),
                    0
            );

            return String.format(Mensagens.PRODUTO_DELETADO, id);
        } catch (ProdutoExceptionREST e) {
            throw e;
        } catch (Exception e) {
            throw new ProdutoExceptionREST(
                    String.format(Mensagens.ERRO_DELETAR_PRODUTO, e.getMessage()),
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }

    // Operações em massa a seguir

    public List<Produto> listarTodos() {
        try {
            List<Produto> produtos = produtoRepository.findAll();
            int totalProdutos = produtos.size();

            if (totalProdutos == 0) {
                return produtos;
            }

            List<Double> tempos = new ArrayList<>();
            List<Integer> tamanhos = new ArrayList<>();

            for (Produto produto : produtos) {
                long tempoInicio = System.nanoTime();

                byte[] produtoBytes = objectMapper.writeValueAsBytes(produto);
                int tamanhoResposta = produtoBytes.length;

                long duracaoNano = System.nanoTime() - tempoInicio;
                double duracaoMs = duracaoNano / 1_000_000.0;

                tempos.add(duracaoMs);
                tamanhos.add(tamanhoResposta);

                desempenhoIndividual.registrarTempo(
                        "GET",
                        "/api/produtos/" +  produto.getId(),
                        duracaoMs,
                        totalProdutos,
                        tamanhoResposta
                );
            }

            if (totalProdutos >= 2) {
                estatisticasExcel.registrarEstatisticas("LISTAGEM_EM_MASSA", tempos, tamanhos);
            }

            return produtos;

        } catch (Exception e) {
            throw new ProdutoExceptionREST(Mensagens.ERRO_BANCO_DADOS, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public String inserirMultiplosProdutos(int quantidade) {
        try {
            if (!produtoRepository.findAll().isEmpty()) {
                produtoRepository.deleteAll();
            }

            double valor = 0.50;
            List<Double> tempos = new ArrayList<>();
            List<Integer> tamanhos = new ArrayList<>();

            for (int cont = 1; cont <= quantidade; cont++) {
                long tempoInicioProduto = System.nanoTime();

                Produto produto = new Produto("Produto_Base_" + cont, cont, valor);
                valor += 0.50;

                Produto produtoSalvo = produtoRepository.save(produto);

                long duracaoNano = System.nanoTime() - tempoInicioProduto;
                double duracaoMs = duracaoNano / 1_000_000.0;
                byte[] produtoBytes = objectMapper.writeValueAsBytes(produtoSalvo);
                int tamanhoResposta = produtoBytes.length;

                tempos.add(duracaoMs);
                tamanhos.add(tamanhoResposta);

                // Registrar métricas individuais
                desempenhoIndividual.registrarTempo(
                        "POST",
                        "/api/multiplos_produtos/" + cont,
                        duracaoMs,
                        produtoRepository.count(),
                        tamanhoResposta
                );
            }

            estatisticasExcel.registrarEstatisticas("INSERCAO_MULTIPLA", tempos, tamanhos);
            return String.format(Mensagens.PRODUTOS_INSERIDOS_SUCESSO, quantidade);

            // import org.springframework.http.HttpStatus; -> Status REST passado na exceção
        } catch (Exception e) {
            throw new ProdutoExceptionREST(
                    String.format(Mensagens.ERRO_INSERIR_MULTIPLOS, e.getMessage()),
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }

    public String multiplosUpdates() {
        try {
            List<Produto> produtos = produtoRepository.findAll();

            if (produtos.isEmpty()) {
                return String.format(Mensagens.NENHUM_PRODUTO_ENCONTRADO, Mensagens.ACAO_ATUALIZAR);
            }

            Random random = new Random();
            List<Double> tempos = new ArrayList<>();
            List<Integer> tamanhos = new ArrayList<>();

            for (Produto produto : produtos) {
                long tempoInicioProduto = System.nanoTime();

                produto.setQuantidade(random.nextInt(100) + 1);
                produto.setValor(1 + (1000 - 1) * random.nextDouble());
                produto.setNome("Produto_Atualizado_" + produto.getId());

                Produto produtoAtualizado = produtoRepository.save(produto);

                long duracaoNano = System.nanoTime() - tempoInicioProduto;
                double duracaoMs = duracaoNano / 1_000_000.0;
                byte[] produtoBytes = objectMapper.writeValueAsBytes(produtoAtualizado);
                int tamanhoResposta = produtoBytes.length;

                tempos.add(duracaoMs);
                tamanhos.add(tamanhoResposta);

                desempenhoIndividual.registrarTempo(
                        "PUT",
                        "/api/multiplos_updates/" + produto.getId(),
                        duracaoMs,
                        produtos.indexOf(produto) + 1,
                        tamanhoResposta
                );
            }

            estatisticasExcel.registrarEstatisticas("ATUALIZACAO_MULTIPLA", tempos, tamanhos);
            return String.format(Mensagens.ATUALIZACAO_CONCLUIDA, produtos.size(), produtos.size());

        } catch (Exception e) {
            throw new ProdutoExceptionREST(
                    String.format(Mensagens.ERRO_ATUALIZAR_MULTIPLOS, e.getMessage()),
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }

    public String deletarTodosProdutos() {
        try {
            List<Produto> produtos = produtoRepository.findAll();

            if (produtos.isEmpty()) {
                return String.format(Mensagens.NENHUM_PRODUTO_ENCONTRADO, Mensagens.ACAO_DELETAR);
            }

            List<Double> tempos = new ArrayList<>();
            List<Integer> tamanhos = new ArrayList<>();

            for (Produto produto : produtos) {
                long tempoInicioProduto = System.nanoTime();
                produtoRepository.delete(produto);

                // Medidas de desempenho
                long duracaoNano = System.nanoTime() - tempoInicioProduto;
                double duracaoMs = duracaoNano / 1_000_000.0;

                tempos.add(duracaoMs);
                tamanhos.add(0);

                desempenhoIndividual.registrarTempo(
                        "DELETE",
                        "/api/todos_produtos/" + produto.getId(),
                        duracaoMs,
                        produtoRepository.count(),
                        0
                );
            }

            estatisticasExcel.registrarEstatisticas("DELECAO_TOTAL", tempos, tamanhos);
            return String.format(Mensagens.DELECAO_CONCLUIDA, produtos.size());

        } catch (Exception e) {
            throw new ProdutoExceptionREST(
                    String.format(Mensagens.ERRO_DELETAR_TODOS, e.getMessage()),
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }
}