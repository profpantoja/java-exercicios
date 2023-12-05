package main.java;

public class Automovel {

    private int numRenavan;
    private int placa;

    public Automovel() {

    }

    public Automovel(int numRenavan, int placa) {
        this.numRenavan = numRenavan;
        this.placa = placa;
    }

    // Métodos Getters e Setters

    public getNumRenavan() {
        return numRenavan;
    }

    public void setNumRenavan(int numRenavan) {
        this.numRenavan = numRenavan;
    }

    public getPlaca() {
            return placa;
        }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public void frear() {
        System.out.println("Automovel freou");

    }

    public void passarmarcha() {
        if (Automovel != parado) {
            System.out.println("Automóvel passando marcha");
        } else {
            System.out.println("Automóvel parado");

        }

    }
}
