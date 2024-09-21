package org.example;

public class Aviao extends Veiculo {

    private int registroAeronautico;
    private boolean decolado;

    public Aviao(int registroAeronautico) {
        this.registroAeronautico = registroAeronautico;
        this.decolado = false;
    }

    public boolean decolar() {
        if (isLigado() && !decolado) {
            System.out.println("Avião decolando");
            decolado = true;
            return true;
        } else {
            System.out.println("Avião está desligado ou já decolado");
            return false;
        }
    }

    public boolean pousar() {
        if (isLigado() && decolado) {
            System.out.println("Avião pousando");
            decolado = false;
            return true;
        } else {
            System.out.println("Avião está desligado ou não decolado");
            return false;
        }
    }
}