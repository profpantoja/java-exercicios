package main.java;

public class Pesquisa extends Publicacoes {

    private String nomedapesquisa;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private String areaPesquisa;

    public Pesquisa(String titulo, String ano, String autores, String nomedapesquisa, String descricao,
            String dataInicio, String dataTermino, String areaPesquisa) {
        super(titulo, ano, autores);
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



    public void imprimirInformacoes(){
        System.out.prinln();
    }
}