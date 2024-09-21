package org.example;

public class Veiculo {

    private boolean ligado;

    public boolean ligar() {
        ligado = true;
        System.out.println("Veículo ligado");
        return ligado;
    }

    public boolean desligar() {
        ligado = false;
        System.out.println("Veículo desligado");
        return ligado;
    }

    public void moverParaFrente(double metros) {
        if (ligado) {
            System.out.println("Veículo movendo para frente " + metros + "m");
        } else {
            System.out.println("Veículo está desligado");
        }
    }

    public void moverParaTras(double metros) {
        if (ligado) {
            System.out.println("Veículo movendo para trás " + metros + "m");
        } else {
            System.out.println("Veículo está desligado");
        }
    }

    public boolean diminuirVelocidadeAteParar() {
        if (ligado) {
            System.out.println("Veículo parado");
            return true;
        } else {
            System.out.println("Veículo está desligado");
            return false;
        }
    }

    public boolean isLigado() {
        return ligado;
    }
}