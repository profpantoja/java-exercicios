package ex18;

import java.time.LocalDate;

public class Item {

    private String nome;
    private double valorCompra;
    private double valorVenda;
    private LocalDate validade;
    private Fornecedor fornecedor;

    

    public Item(String nome, double valorCompra, Fornecedor fornecedor, LocalDate validade) {
        this.nome = nome;
        this.valorCompra = valorCompra;
        this.valorVenda = valorCompra * 1.3;
        this.validade = validade; 
        this.fornecedor = fornecedor;
    }


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

    public boolean estaVencido() {
        return validade.isBefore(LocalDate.now());
    }

}
