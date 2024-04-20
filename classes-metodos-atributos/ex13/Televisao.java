package ex13;

public class Televisao{
    private String status;
    private String source;
    private int canais;

    public Televisao(){
        this.status = "Off";
        this.source = "HDMI";
        this.canais = 0;
    }

    public void ligar(){
        this.status = "On";     
        System.out.println("Televisão ligada.");
    }

    public void desligar(){
        this.status = "Off";
        System.out.println("Televisão desligada.");
    }

    public void mudarParaHDMI(){
        this.source = "HDMI";
    }

    public void mudarParaUSB(){
        this.source = "USB";
    }

    public String getStatus() {
        return status;
    }    

    public String getSource() {
        return source;
    }

    public int getCanais() {
        return canais;
    }

    public void setCanais(int canais) {
        this.canais = canais;
    }

    

}