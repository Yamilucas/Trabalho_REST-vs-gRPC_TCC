package tcc.gRPC.Produtos.exceptions;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;

public class ProdutoExceptiongRPC extends StatusRuntimeException {

    public ProdutoExceptiongRPC(Status status, String message) {
        super(status.withDescription(message));
    }
}


