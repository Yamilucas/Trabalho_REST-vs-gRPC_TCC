package tcc.APIREST.Produtos.resources;

import tcc.APIREST.Produtos.model.Produto;
import tcc.APIREST.Produtos.servicos.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ProdutoResource {

    @Autowired
    private ProdutoService produtoService;

    // Operações individuais

    @PostMapping("/produtos")
    public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto) {
        Produto produtoCriado = produtoService.criarProdutoIndividual(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoCriado);
    }

    @PutMapping("/produtos/{id}")
    public ResponseEntity<Produto> atualizarProduto(@PathVariable long id, @RequestBody Produto produto) {
        Produto produtoAtualizado = produtoService.updateProduto(id, produto);
        return ResponseEntity.ok(produtoAtualizado);
    }

    @GetMapping("/produtos/{id}")
    public ResponseEntity<Produto> buscarProdutoPorId(@PathVariable long id) {
        Produto produto = produtoService.buscarPorId(id);
        return ResponseEntity.ok(produto);
    }

    @DeleteMapping("/produtos/{id}")
    public ResponseEntity<String> deletarProdutoPorId(@PathVariable long id) {
        String mensagem = produtoService.deletarPorId(id);
        return ResponseEntity.ok(mensagem);
    }

    // Operações em massa

    @GetMapping("/produtos")
    public ResponseEntity<List<Produto>> listarTodosProdutos() {
        List<Produto> produtos = produtoService.listarTodos();
        return ResponseEntity.ok(produtos);
    }

    @PostMapping("/multiplos_produtos/{quantidade}")
    public ResponseEntity<String> inserirMultiplosProdutos(@PathVariable int quantidade) {
        String resultado = produtoService.inserirMultiplosProdutos(quantidade);
        return ResponseEntity.status(HttpStatus.CREATED).body(resultado);
    }

    @PutMapping("/multiplos_updates")
    public ResponseEntity<String> atualizarMultiplosProdutos() {
        String resultado = produtoService.multiplosUpdates();
        return ResponseEntity.ok(resultado);
    }

    @DeleteMapping("/todos_produtos")
    public ResponseEntity<String> deletarTodosProdutos() {
        String resultado = produtoService.deletarTodosProdutos();
        return ResponseEntity.ok(resultado);
    }
}