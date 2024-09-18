public class MainVeiculo {

    public static void main(String[] args) {

    Automovel automovel = new Automovel("219792","EIK1702");
    Aviao aviao = new Aviao("123456");
    Barco barco = new Barco("789999");

    automovel.ligar();
    aviao.ligar();
    barco.ligar();

    automovel.desligar();
    aviao.frente();
    barco.re();
    automovel.parar();

    }
    
}
