package tcc.APIREST.Produtos.desempenho;

import tcc.APIREST.Produtos.repository.ProdutoRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class InterceptadorDesempenho implements HandlerInterceptor {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private GravadorDesempenho gravadorDesempenho;



    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // Registra o tempo de início da requisição
        request.setAttribute("tempoInicio", System.nanoTime());
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        int status = response.getStatus();
        if (status >= 400) {
            return;
        }

        long tempoInicio = (long) request.getAttribute("tempoInicio");
        long duracaoNano = System.nanoTime() - tempoInicio;
        double duracaoMs = duracaoNano / 1_000_000.0;
        String metodo = request.getMethod();
        String endpoint = request.getRequestURI();

        long totalRegistros = produtoRepository.count();




        gravadorDesempenho.registrarTempo(metodo, endpoint, duracaoMs, totalRegistros);
    }
}