package org.example2;

public class Barco extends Veiculo {
    private String registroEmbarcacao;

    public Barco(String registroEmbarcacao) {
        this.registroEmbarcacao = registroEmbarcacao;
    }

    @Override
    public void ligar() {
        System.out.println("Barco está ligando.");
    }

    @Override
    public void desligar() {
        System.out.println("Barco está desligando.");
    }

    @Override
    public void moverParaFrente() {
        System.out.println("Barco está se movendo para frente.");
    }

    @Override
    public void moverRe() {
        System.out.println("Barco está se movendo em ré.");
    }

    @Override
    public void parar() {
        System.out.println("Barco está parando.");
    }
}