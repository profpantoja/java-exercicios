public class Main {
    public static void main(String[] args) {
        Automovel carro = new Automovel("123456789", "ABC-1234");
        Aviao aviao = new Aviao("F-39 Gripen");
        Barco barco = new Barco("F-5M Tiger");

        carro.ligar();
        carro.moverFrente();
        carro.passarMarcha();
        carro.desligar();

        aviao.ligar();
        aviao.decolar();
        aviao.pousar();
        aviao.desligar();

        barco.ligar();
        barco.navegar();
        barco.ancorar();
        barco.desligar();
    }
}
