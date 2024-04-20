package ex13;

public class ArCondicionado {
    private String status;

    public ArCondicionado() {
        this.status = "off";
    }

    public void ligar() {
        this.status = "on";
        System.out.println("Ar condicionado ligado.");
    }

    public void desligar() {
        this.status = "off";
        System.out.println("Ar condicionado desligado.");
    }

    public String getStatus() {
        return this.status;
    }
}
