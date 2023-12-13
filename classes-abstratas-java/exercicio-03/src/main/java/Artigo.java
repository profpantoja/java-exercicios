package main.java;

public class Artigo extends Publicacoes {

    private String nomePeriodico;
    private int volume;
    private int numero;

    public Artigo(String titulo, String ano, String autores, int volume,int numero){
        super(titulo,ano,autores);
        this.numero = numero;
        this.volume = volume;
    }

    // Métodos Getters e Setters

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
        this.placa = placa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void imprimirInformacoes(){
        System.out.prinln();
    }

}