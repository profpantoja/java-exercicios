package org.example2;

public class Aviao extends Veiculo {
    private String registroAeronautico;

    public Aviao(String registroAeronautico) {
        this.registroAeronautico = registroAeronautico;
    }

    @Override
    public void ligar() {
        System.out.println("Avião está ligando.");
    }

    @Override
    public void desligar() {
        System.out.println("Avião está desligando.");
    }

    @Override
    public void moverParaFrente() {
        System.out.println("Avião está se movendo para frente.");
    }

    @Override
    public void moverRe() {
        System.out.println("Avião está se movendo em ré.");
    }

    @Override
    public void parar() {
        System.out.println("Avião está parando.");
    }
}