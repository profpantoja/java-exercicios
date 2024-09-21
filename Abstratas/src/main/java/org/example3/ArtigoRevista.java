package org.example3;

import java.util.List;

public class ArtigoRevista extends Publicacao {
    private String nomePeriodico;
    private int volume;
    private int numero;

    public ArtigoRevista(String titulo, int ano, List<String> autores, String areaPesquisa, Pesquisa pesquisaAssociada) {
        super(titulo, ano, autores, areaPesquisa, pesquisaAssociada);
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano: " + getAno());
        System.out.println("Autores: " + getAutores());
        System.out.println("Área de Pesquisa: " + getAreaPesquisa());
        System.out.println("Nome do Periódico: " + nomePeriodico);
        System.out.println("Volume: " + volume);
        System.out.println("Número: " + numero);
    }

    public String getNomePeriodico() {
        return nomePeriodico;
    }

    public void setNomePeriodico(String nomePeriodico) {
        this.nomePeriodico = nomePeriodico;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}