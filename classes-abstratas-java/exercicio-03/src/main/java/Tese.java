package main.java;

public class Tese extends Publicacoes{

    private String grau;
    private String instituicao;

    public Tese(String titulo, String ano, String autores, String grau, String instituicao){
        super(titulo,ano,autores);
        this.grau = grau;
        this.instituicao = instituicao;

    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public int getInstituicao() {
        return instituicao;
    }

    public void imprimirInformacoes(){
        System.out.prinln(this.nomedapesquisa);
        System.out.println(this.dataInicio);
        for(Coordenador c : this.getCoordenadores()){
            System.out.println("")
    }


}