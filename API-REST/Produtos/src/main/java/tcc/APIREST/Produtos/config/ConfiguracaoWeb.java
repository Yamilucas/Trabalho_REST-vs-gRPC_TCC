package tcc.APIREST.Produtos.config;

import tcc.APIREST.Produtos.desempenho.InterceptadorDesempenho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfiguracaoWeb implements WebMvcConfigurer {

    @Autowired
    private InterceptadorDesempenho interceptadorDesempenho;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(interceptadorDesempenho);

    }

}
