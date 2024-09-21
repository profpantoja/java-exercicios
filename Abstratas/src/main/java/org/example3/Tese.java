package org.example3;

import java.util.List;

public class Tese extends Publicacao {
    private String grau;
    private String instituicao;

    @Override
    public void imprimirInformacoes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano: " + getAno());
        System.out.println("Autores: " + getAutores());
        System.out.println("Área de Pesquisa: " + getAreaPesquisa());
        System.out.println("Grau: " + grau);
        System.out.println("Instituição: " + instituicao);
    }

    public Tese(String titulo, int ano, List<String> autores, String areaPesquisa, Pesquisa pesquisaAssociada, String grau, String instituicao) {
        super(titulo, ano, autores, areaPesquisa, pesquisaAssociada);
        this.grau = grau;
        this.instituicao = instituicao;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
}