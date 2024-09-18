package ex13;

import java.util.ArrayList;

public class Quarto{
    private Lampada lampada;
    private Abajour abajour;
    private ArrayList<Ventilador> ventiladores;
    private ArCondicionado arCondicionado;
    private Televisao televisao;

    public Quarto(){
        this.lampada = new Lampada();
        this.abajour = new Abajour();
        this.ventiladores = new ArrayList<>();
        this.televisao = new Televisao();
        for(int i = 0; i < 3; i++){
            this.ventiladores.add(new Ventilador());
        }
        this.arCondicionado = new ArCondicionado();
        
    }

    public void ExibirStatus(){
        System.out.println("Status dos dispositivos: ");
        System.out.println("Lampada: " + this.lampada.getStatus());
        System.out.println("Abajour: " + this.abajour.getStatus());
        System.out.println("Ar condicionado: " + this.arCondicionado.getStatus());
        System.out.println("Televisão: " + this.televisao.getStatus());
        for(int i = 0; i < this.ventiladores.size(); i++){
            System.out.println("Ventilador " + (i + 1) + ": " + this.ventiladores.get(i).getStatus());
        }
        
    }

    public Lampada getLampada() {
        return lampada;
    }

    public void setLampada(Lampada lampada) {
        this.lampada = lampada;
    }

    public Abajour getAbajour() {
        return abajour;
    }

    public void setAbajour(Abajour abajour) {
        this.abajour = abajour;
    }

    public ArrayList<Ventilador> getVentiladores() {
        return ventiladores;
    }

    public void setVentiladores(ArrayList<Ventilador> ventiladores) {
        this.ventiladores = ventiladores;
    }

    public ArCondicionado getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(ArCondicionado arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public Televisao getTelevisao() {
        return televisao;
    }

    public void setTelevisao(Televisao televisao) {
        this.televisao = televisao;
    }
    
}
