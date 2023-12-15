package main.java;

public class Barco extends Veiculo {

    private int registroembarcacao;

    public Barco(int registroembarcacao) {
        super();
        this.registroembarcacao = registroembarcacao;

    }

    // Métodos Getters e Setters

public int getRegistroembarcacao(){
    return registroembarcacao;
}

    public void setRegistroembarcacao(int registroembarcacao) {
        this.registroembarcacao = registroembarcacao;

    }

    public void navegar() {
        if (Barco != ancorar()) {
            System.out.println("Barco navegando !");
        }

    }

    public void ancorar() {
        if (Barco == ancorar()) {
            System.out.println("Barco ancorado !");

        }

    }
}