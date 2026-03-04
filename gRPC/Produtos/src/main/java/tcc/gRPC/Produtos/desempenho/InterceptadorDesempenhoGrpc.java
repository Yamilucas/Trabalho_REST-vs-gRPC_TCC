package tcc.gRPC.Produtos.desempenho;

import io.grpc.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tcc.gRPC.Produtos.repository.ProdutoRepository;

@Component
public class InterceptadorDesempenhoGrpc implements ServerInterceptor {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private GravadorDesempenho gravadorDesempenho;

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call,
            Metadata headers,
            ServerCallHandler<ReqT, RespT> next) {

        long tempoInicio = System.nanoTime();

        String metodo = call.getMethodDescriptor().getBareMethodName();
        String endpoint = call.getMethodDescriptor().getServiceName();

        final Status[] statusFinal = new Status[1];

        ServerCall<ReqT, RespT> wrappedCall = new ForwardingServerCall.SimpleForwardingServerCall<ReqT, RespT>(call) {
            @Override
            public void close(Status status, Metadata trailers) {
                statusFinal[0] = status;
                super.close(status, trailers);
            }
        };

        ServerCall.Listener<ReqT> listener = next.startCall(wrappedCall, headers);

        return new ForwardingServerCallListener.SimpleForwardingServerCallListener<ReqT>(listener) {
            @Override
            public void onComplete() {
                long duracaoNano = System.nanoTime() - tempoInicio;
                double duracaoMs = duracaoNano / 1_000_000.0;
                long totalRegistros = produtoRepository.count();


                if (statusFinal[0] != null && statusFinal[0].isOk()) {
                    gravadorDesempenho.registrarTempo(metodo, endpoint, duracaoMs, totalRegistros);
                }

                super.onComplete();
            }
        };
    }
}