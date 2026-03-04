package tcc.gRPC.Produtos.controller;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import tcc.gRPC.Produtos.generated.*;
import tcc.gRPC.Produtos.model.Produto;
import tcc.gRPC.Produtos.servicos.ProdutoService;

@GrpcService
public class ProdutoController extends ProdutoServiceGrpc.ProdutoServiceImplBase {

    @Autowired
    private ProdutoService produtoService;

    @Override
    public void criarProdutoIndividual(CreateProdutoRequest request, StreamObserver<tcc.gRPC.Produtos.generated.Produto> responseObserver) {
        Produto produto = new Produto();
        produto.setNome(request.getNome());
        produto.setQuantidade(request.getQuantidade());
        produto.setValor(request.getValor());

        Produto produtoSalvo = produtoService.criarProdutoIndividual(produto);

        tcc.gRPC.Produtos.generated.Produto response = tcc.gRPC.Produtos.generated.Produto.newBuilder()
                .setId(produtoSalvo.getId())
                .setNome(produtoSalvo.getNome())
                .setQuantidade(produtoSalvo.getQuantidade())
                .setValor(produtoSalvo.getValor())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateProduto(UpdateProdutoRequest request, StreamObserver<tcc.gRPC.Produtos.generated.Produto> responseObserver) {
        Produto produto = new Produto();
        produto.setNome(request.getNome());
        produto.setQuantidade(request.getQuantidade());
        produto.setValor(request.getValor());

        Produto produtoAtualizado = produtoService.updateProduto(request.getId(), produto);

        tcc.gRPC.Produtos.generated.Produto response = tcc.gRPC.Produtos.generated.Produto.newBuilder()
                .setId(produtoAtualizado.getId())
                .setNome(produtoAtualizado.getNome())
                .setQuantidade(produtoAtualizado.getQuantidade())
                .setValor(produtoAtualizado.getValor())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void buscarPorId(GetProdutoRequest request, StreamObserver<tcc.gRPC.Produtos.generated.Produto> responseObserver) {
        Produto produto = produtoService.buscarPorId(request.getId());

        tcc.gRPC.Produtos.generated.Produto response = tcc.gRPC.Produtos.generated.Produto.newBuilder()
                .setId(produto.getId())
                .setNome(produto.getNome())
                .setQuantidade(produto.getQuantidade())
                .setValor(produto.getValor())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deletarPorId(DeleteProdutoRequest request, StreamObserver<RespostaMensagem> responseObserver) {
        String mensagem = produtoService.deletarPorId(request.getId());

        RespostaMensagem response = RespostaMensagem.newBuilder()
                .setMensagem(mensagem)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void listarTodos(Vazio request, StreamObserver<ListaProdutosResponse> responseObserver) {
        List<Produto> produtos = produtoService.listarTodos();

        ListaProdutosResponse.Builder responseBuilder = ListaProdutosResponse.newBuilder();
        for (Produto p : produtos) {
            tcc.gRPC.Produtos.generated.Produto produtoProto = tcc.gRPC.Produtos.generated.Produto.newBuilder()
                    .setId(p.getId())
                    .setNome(p.getNome())
                    .setQuantidade(p.getQuantidade())
                    .setValor(p.getValor())
                    .build();
            responseBuilder.addProdutos(produtoProto);
        }

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void inserirMultiplosProdutos(InsercaoMultiplaRequest request, StreamObserver<RespostaMensagem> responseObserver) {
        String mensagem = produtoService.inserirMultiplosProdutos(request.getQuantidade());

        RespostaMensagem response = RespostaMensagem.newBuilder()
                .setMensagem(mensagem)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void multiplosUpdates(Vazio request, StreamObserver<RespostaMensagem> responseObserver) {
        String mensagem = produtoService.multiplosUpdates();

        RespostaMensagem response = RespostaMensagem.newBuilder()
                .setMensagem(mensagem)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deletarTodosProdutos(Vazio request, StreamObserver<RespostaMensagem> responseObserver) {
        String mensagem = produtoService.deletarTodosProdutos();

        RespostaMensagem response = RespostaMensagem.newBuilder()
                .setMensagem(mensagem)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}