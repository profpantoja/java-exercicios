package org.example2;

public class Automovel extends Veiculo {
    private String renavam;
    private String placa;

    public Automovel(String renavam, String placa) {
        this.renavam = renavam;
        this.placa = placa;
    }

    @Override
    public void ligar() {
        System.out.println("Automóvel está ligando.");
    }

    @Override
    public void desligar() {
        System.out.println("Automóvel está desligando.");
    }

    @Override
    public void moverParaFrente() {
        System.out.println("Automóvel está se movendo para frente.");
    }

    @Override
    public void moverRe() {
        System.out.println("Automóvel está se movendo em ré.");
    }

    @Override
    public void parar() {
        System.out.println("Automóvel está parando.");
    }
}