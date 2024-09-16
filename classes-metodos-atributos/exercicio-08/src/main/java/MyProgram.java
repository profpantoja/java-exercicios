
public class MyProgram {

    public static void main(String[] args) throws Exception {
        
        Automovel carro1 = new Automovel();
        Automovel carro2 = new Automovel();

        carro1.Acelerar();
        carro1.Frear();
        carro1.EsquerdaDireita("Direita");

        carro2.AddKm(200);
        carro1.AddKm(20);

        carro1.VelocidadeMedia(2.32f, 252);
        carro2.VelocidadeMedia(0.35f, 42);
    }   
}
