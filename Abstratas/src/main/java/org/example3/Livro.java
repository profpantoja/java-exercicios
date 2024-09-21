package org.example3;

import java.util.List;

public class Livro extends Publicacao {
    private String editora;
    private String localPublicacao;

    public Livro(String titulo, int ano, List<String> autores, String areaPesquisa, Pesquisa pesquisaAssociada) {
        super(titulo, ano, autores, areaPesquisa, pesquisaAssociada);
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano: " + getAno());
        System.out.println("Autores: " + getAutores());
        System.out.println("Área de Pesquisa: " + getAreaPesquisa());
        System.out.println("Editora: " + editora);
        System.out.println("Local de Publicação: " + localPublicacao);
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getLocalPublicacao() {
        return localPublicacao;
    }

    public void setLocalPublicacao(String localPublicacao) {
        this.localPublicacao = localPublicacao;
    }
}