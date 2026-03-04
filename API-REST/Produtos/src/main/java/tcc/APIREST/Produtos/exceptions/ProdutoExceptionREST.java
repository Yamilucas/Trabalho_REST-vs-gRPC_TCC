package tcc.APIREST.Produtos.exceptions;

import org.springframework.http.HttpStatus;

public class ProdutoExceptionREST extends RuntimeException {
    private final HttpStatus status;

    public ProdutoExceptionREST(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }

}




