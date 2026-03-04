package tcc.gRPC.Produtos.config;

import net.devh.boot.grpc.server.config.GrpcServerProperties;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tcc.gRPC.Produtos.desempenho.InterceptadorDesempenhoGrpc;


@Configuration
@EnableConfigurationProperties(GrpcServerProperties.class)
public class GrpcConfig {

    @Bean
    @GrpcGlobalServerInterceptor
    public InterceptadorDesempenhoGrpc desempenhoGrpcInterceptor() {

        return new InterceptadorDesempenhoGrpc();
    }
}
