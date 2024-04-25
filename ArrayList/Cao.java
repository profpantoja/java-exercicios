package ArrayList;

import java.time.LocalDate;

public class Cao{
    private String nome;
    private LocalDate dataDeEntrada;
    private String raca;
    private String cor;
    private double peso;

    public Cao(){

    }

    public Cao(String nome, LocalDate dataDeEntrada, String raca, String cor, double peso) {
        this.nome = nome;
        this.dataDeEntrada = dataDeEntrada;
        this.raca = raca;
        this.cor = cor;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(LocalDate dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
}
