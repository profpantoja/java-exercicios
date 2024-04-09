public class MyProgram {
    
    public static void main(String[] args) {

        Automovel carro1 = new Automovel();
        Automovel carro2 = new Automovel();

        carro1.gerarVelocidadeMedia(252, 2.32);
        carro2.gerarVelocidadeMedia(42, 0.35);
    
        carro1.adicionarKm(20);
        carro1.mover("direita");
        carro1.acelerar();
        carro1.frear();

        carro2.adicionarKm(30);
        carro2.mover("esquerda");
        carro2.acelerar();
        carro2.frear();
    }
}
