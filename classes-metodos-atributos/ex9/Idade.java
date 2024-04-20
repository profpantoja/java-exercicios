package ex9;

import java.time.LocalDate;
import java.time.Period;

public class Idade {

    private String nome;
    private String apelido;
    private LocalDate nascimentoData;

    public Idade(){

    }

    public void idade(int ano, int mes, int dia){

        LocalDate nascimento = LocalDate.of(ano, mes, dia);
        LocalDate dataAtual = LocalDate.now();
        Period diasPercorridos = Period.between(nascimento, dataAtual);
        int idade = diasPercorridos.getYears();

        System.out.println("Idade: " + idade + " anos.");

        

    }

    public Idade(String nome, String apelido, LocalDate nascimentoData) {
        this.nome = nome;
        this.apelido = apelido;
        this.nascimentoData = nascimentoData;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public LocalDate getNascimentoData() {
        return nascimentoData;
    }

    public void setNascimentoData(LocalDate nascimentoData) {
        this.nascimentoData = nascimentoData;
    }

}
