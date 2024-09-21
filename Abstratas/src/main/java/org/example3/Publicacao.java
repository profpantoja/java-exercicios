package org.example3;

import java.util.List;

public abstract class Publicacao {
    private String titulo;
    private int ano;
    private List<String> autores;
    private String areaPesquisa;
    private Pesquisa pesquisaAssociada;

    public abstract void imprimirInformacoes();

    public Publicacao(String titulo, int ano, List<String> autores, String areaPesquisa, Pesquisa pesquisaAssociada) {
        this.titulo = titulo;
        this.ano = ano;
        this.autores = autores;
        this.areaPesquisa = areaPesquisa;
        this.pesquisaAssociada = pesquisaAssociada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }

    public void setAreaPesquisa(String areaPesquisa) {
        this.areaPesquisa = areaPesquisa;
    }

    public Pesquisa getPesquisaAssociada() {
        return pesquisaAssociada;
    }

    public void setPesquisaAssociada(Pesquisa pesquisaAssociada) {
        this.pesquisaAssociada = pesquisaAssociada;
    }
}