package tcc.gRPC.Produtos.exceptions;

import io.grpc.Status;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;

@GrpcAdvice
public class GlobalExceptiongRPC {

    @GrpcExceptionHandler(ProdutoExceptiongRPC.class)
    public Status handleProdutoException(ProdutoExceptiongRPC e) {
        return e.getStatus();
    }

    @GrpcExceptionHandler(Exception.class)
    public Status handleGenericException(Exception e) {
        return Status.INTERNAL.withDescription("Erro interno do servidor");
    }
}