package ex13;

public class Abajour {
    private String status;

    public Abajour() {
        this.status = "off";
    }

    public void ligar() {
        this.status = "on";
        System.out.println("Abajour ligado.");
    }

    public void desligar() {
        this.status = "off";
        System.out.println("Abajour desligado.");
    }

    public String getStatus() {
        return this.status;
    }
}
