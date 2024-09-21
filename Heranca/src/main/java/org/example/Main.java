package org.example;

public class Main {
    public static void main(String[] args) {
        Automovel automovel = new Automovel(123456, 7890);
        Aviao aviao = new Aviao(123456);
        Barco barco = new Barco(123456);

        automovel.ligar();
        automovel.moverParaFrente(100);
        automovel.passarMarcha();
        automovel.frear();
        automovel.desligar();

        aviao.ligar();
        aviao.decolar();
        aviao.moverParaFrente(1000);
        aviao.pousar();
        aviao.desligar();

        barco.ligar();
        barco.desancorar();
        barco.navegar();
        barco.ancorar();
        barco.desligar();
    }
}