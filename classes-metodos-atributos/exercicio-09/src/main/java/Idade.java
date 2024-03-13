package main.Java;

import java.util.Date;

public class Idade {
    
    private String nome;
    private String apelido;
    private Date nascimento;

    public Idade() {

    }

    public Idade(String nome, String apelido, Date dataNascimento) {
        this.nome = nome;
        this.apelido = apelido;
        this.nascimento = dataNascimento;
    }

    public Idade(Date nascimento) {
       this.nascimento = nascimento; 
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

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public int getIdade() {
        Date atualmente = new Date();
        long calculo = atualmente.getTime() - nascimento.getTime();
        long conversao = calculo / 1000 / 60 / 60 / 24 / 365;
        return (int) conversao;
    }

}
