package main.java;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Pesquisa {

    private String nomedapesquisa;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private String areaPesquisa;

    private ArrayList<Coordenador> coordenadores;

    public Pesquisa(String nomedapesquisa, String descricao,String dataInicio, String dataTermino, String areaPesquisa) {
    
        this.nomedapesquisa = nomedapesquisa;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.areaPesquisa = areaPesquisa;
    }

    public String getNomedaPesquisa() {
        return nomedapesquisa;
    }

    public void setNomedaPesquisa(String nomedapesquisa) {
        this.nomedapesquisa = nomedapesquisa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String instituicao) {
        this.instituicao = instituicao;
    }

    public int getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }

    public void setAreaPesquisa(String areaPesquisa) {
        this.areaPesquisa = areaPesquisa;
    }

    public ArrayList<Coordenador> getCoordenadores(){
        return coordenadores;
    }

    public void setCoordenadores(ArrayList<Coordenador>coordenadores){
        this.coordenadores = coordenadores;

    }



    public void imprimirInformacoes(){

        System.out.prinln(this.nomedapesquisa);
        System.out.println(this.dataInicio);
        for(Coordenador c : this.getCoordenadores()){
            System.out.println("");

        }
        }
    }
}