public class Jogo {
    public static void main(String[] args) {
        Kate kate = new Kate();
        Inimigo badFish1 = new Inimigo("BadFish");

        // Criando poderes
        Poder superBark = new Poder("SuperBark", 10);
        Poder rearRocket = new Poder("RearRocket", 50);

        // Kate ataca o inimigo BadFish com RearRocket
        badFish1.receberDano(rearRocket);

        // BadFish ataca Kate com SuperBark
        kate.receberDano(superBark);
    }
}
