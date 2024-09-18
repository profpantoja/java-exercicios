package ex13;

public class Lampada {
    private String status;

    public Lampada() {
        this.status = "off";
    }

    public void ligar() {
        this.status = "on";
        System.out.println("Lâmpada ligada.");
    }

    public void desligar() {
        this.status = "off";
        System.out.println("Lâmpada desligada.");
    }

    public String getStatus() {
        return this.status;
    }
}
