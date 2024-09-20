public class Main {
    public static void main(String[] args) {
        Automovel carro = new Automovel("123456789", "ABC-1234");
        Aviao aviao = new Aviao("BR001234");
        Barco barco = new Barco("BRBO12345");

        carro.ligar();
        carro.moverFrente();

        aviao.ligar();
        aviao.moverFrente();

        barco.ligar();
        barco.moverFrente();
    }
}
