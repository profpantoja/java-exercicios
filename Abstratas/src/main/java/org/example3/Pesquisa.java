package org.example3;

import java.util.Date;
import java.util.List;

public class Pesquisa {
    private String nome;
    private String descricao;
    private Date dataInicio;
    private Date dataTermino;
    private AreaPesquisa areaPesquisa;
    private Coordenador coordenador;
    private List<Publicacao> publicacoes;

    public Pesquisa(String nome, String descricao, Date dataInicio, Date dataTermino, AreaPesquisa areaPesquisa, Coordenador coordenador, List<Publicacao> publicacoes) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.areaPesquisa = areaPesquisa;
        this.coordenador = coordenador;
        this.publicacoes = publicacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public AreaPesquisa getAreaPesquisa() {
        return areaPesquisa;
    }

    public void setAreaPesquisa(AreaPesquisa areaPesquisa) {
        this.areaPesquisa = areaPesquisa;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public List<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(List<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }
}