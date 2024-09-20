import java.time.LocalDate;

public class Mercadoria {
    private String nome;
    private double valorCompra;
    private double valorVenda;
    private LocalDate validade;
    private Fornecedor fornecedor;

    public Mercadoria(String nome, double valorCompra, LocalDate validade, Fornecedor fornecedor) {
        this.nome = nome;
        this.valorCompra = valorCompra;
        this.valorVenda = calcularValorVenda(valorCompra);
        this.validade = validade;
        this.fornecedor = fornecedor;
    }

    private double calcularValorVenda(double valorCompra) {
        return valorCompra * 1.30;  // 30% de juros
    }

    public boolean isValidadeExpirada() {
        return LocalDate.now().isAfter(this.validade);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }
}
