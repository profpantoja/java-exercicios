package org.example;

public class Automovel extends Veiculo {

    private int renavam;
    private int placa;

    public Automovel(int renavam, int placa) {
        this.renavam = renavam;
        this.placa = placa;
    }

    public void frear() {
        if (isLigado()) {
            System.out.println("Automóvel freando");
        } else {
            System.out.println("Automóvel está desligado");
        }
    }

    public void passarMarcha() {
        if (isLigado() && !diminuirVelocidadeAteParar()) {
            System.out.println("Passando marcha");
        } else {
            System.out.println("Automóvel está desligado ou parado");
        }
    }
}