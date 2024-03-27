package src.main.java;
import java.util.ArrayList;

public class MyProgram {

    public static void main(String[] args) {

    Quarto q = new Quarto();

    Ventilador ventilador1 = new Ventilador(3);
    Ventilador ventilador2 = new Ventilador(2);
    Ventilador ventilador3 = new Ventilador(1);

    q.ligarAbaju();
    q.desligarAbajur();

    q.ligarArcondicionado();
    q.desligarArcondicionado();

    q.ligarLampada();
    q.desligarLampada();

    q.ligarTv();
    q.mudarSinalTv("i.e");
    q.mudarCanalTv("Globo");
    q.mudarCanalTv("SBT");
    q.desligarTv();
    q.mudarCanalTv("Home & Healf");

    ventilador3.setStatus(q.desligarVentilador(ventilador3.isStatus()));

    ventilador1.setStatus(q.ligarVentilador(ventilador1.isStatus()));
    ventilador2.setStatus(q.ligarVentilador(ventilador2.isStatus()));
    ventilador3.setStatus(q.ligarVentilador(ventilador3.isStatus()));

    ventilador2.setStatus(q.desligarVentilador(ventilador2.isStatus()));
    ventilador2.setStatus(q.desligarVentilador(ventilador2.isStatus()));


    ArrayList<Ventilador> ventiladores = new ArrayList<Ventilador>();


    ventiladores.add(ventilador1);
    ventiladores.add(ventilador2);
    ventiladores.add(ventilador3);

    System.out.println("\nVentilador 1:\nVelocidade: " +ventilador1.getVelocidade() +"\nStatus ventilador ligado: " +ventilador1.isStatus());
    System.out.println("\nVentilador 2:\nVelocidade: " +ventilador2.getVelocidade() +"\nStatus ventilador ligado: " +ventilador2.isStatus());
    System.out.println("\nVentilador 3:\nVelocidade: " +ventilador3.getVelocidade() +"\nStatus ventilador ligado: " +ventilador3.isStatus());

    
    }
    
}
