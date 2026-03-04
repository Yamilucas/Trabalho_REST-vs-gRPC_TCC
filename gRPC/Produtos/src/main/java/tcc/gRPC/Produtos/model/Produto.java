package tcc.gRPC.Produtos.model;


import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_PRODUTO",
        uniqueConstraints = @UniqueConstraint(columnNames = "nome"))
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 100, unique = true)
    private String nome;

    @Column(nullable = false)
    private int quantidade;

    @Column(nullable = false)
    private double valor;

    // Construtor padrão
    public Produto() {
    }

    // Construtor com parâmetros
    public Produto(String nome, int quantidade, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}