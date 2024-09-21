package org.example3;

import java.util.List;

public class ArtigoConferencia extends Publicacao {
    private String nomeConferencia;

    public ArtigoConferencia(String titulo, int ano, List<String> autores, String areaPesquisa, Pesquisa pesquisaAssociada) {
        super(titulo, ano, autores, areaPesquisa, pesquisaAssociada);
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano: " + getAno());
        System.out.println("Autores: " + getAutores());
        System.out.println("Área de Pesquisa: " + getAreaPesquisa());
        System.out.println("Nome da Conferência: " + nomeConferencia);
    }

    public String getNomeConferencia() {
        return nomeConferencia;
    }

    public void setNomeConferencia(String nomeConferencia) {
        this.nomeConferencia = nomeConferencia;
    }
}