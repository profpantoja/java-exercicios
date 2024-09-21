package org.example;

public class Barco extends Veiculo {

    private int registroDeEmbarcacao;
    private boolean ancorado;

    public Barco(int registroDeEmbarcacao) {
        this.registroDeEmbarcacao = registroDeEmbarcacao;
        this.ancorado = true;
    }

    public void navegar() {
        if (isLigado() && !ancorado) {
            System.out.println("Barco navegando");
        } else {
            System.out.println("Barco está desligado ou ancorado");
        }
    }

    public boolean ancorar() {
        if (isLigado()) {
            System.out.println("Barco ancorado");
            ancorado = true;
            return true;
        } else {
            System.out.println("Barco está desligado");
            return false;
        }
    }

    public boolean desancorar() {
        if (isLigado()) {
            System.out.println("Barco desancorado");
            ancorado = false;
            return true;
        } else {
            System.out.println("Barco está desligado");
            return false;
        }
    }
}