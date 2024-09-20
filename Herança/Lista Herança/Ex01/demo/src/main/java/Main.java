public class Main {
    public static void main(String[] args) {

        Automovel carro = new Automovel("1762748", "ANA694");
        Barco barco = new Barco("Registro da Marinha do Brasil");
        Aviao aviao = new Aviao("Registro da Aeronautica brasileira");

        carro.ligar();
        carro.moverFrente();
        carro.passarMarcha();
        carro.frear();
        carro.marchaRe();   
        carro.desligar();
        System.out.println();
        barco.ligar();
        barco.navegar();
        barco.ancorar();
        barco.desligar();
        System.out.println();
        aviao.ligar();
        aviao.decolar();
        aviao.pousar();
        aviao.decolar();
        aviao.desligar();
    }
}
