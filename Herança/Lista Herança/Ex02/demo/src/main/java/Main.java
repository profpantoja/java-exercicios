

public class Main {
    public static void main(String[] args) {
       
        Inimigos BadFish1 = new Inimigos(100);
        Inimigos BadFish2 = new Inimigos(100);
        Inimigos BadFish3 = new Inimigos(100);
        Inimigos MadCat1 = new Inimigos(200);
        Inimigos MadCat2 = new Inimigos(200);

        Kate kate = new Kate(5);

        Poderes poderInicial = new Poderes(20, "Poder Inicial");
        Poderes superBark = new Poderes(50, "Super Bark");
        Poderes eyeBeam= new Poderes(60, "Eye Beam");
        Poderes rearRocket = new Poderes(90, "Rear Rocket");

        kate.addPoder(poderInicial);
        kate.addPoder(superBark);
        kate.addPoder(eyeBeam);
        kate.addPoder(rearRocket);

        kate.andar();
        kate.pular();
        kate.andar();
        System.out.println();

        kate.utilizarPoder("Poder Inicial", BadFish1);
        BadFish1.aplicarDano(20);
        System.out.println();
        kate.utilizarPoder("Rear Rocket", BadFish1);
        BadFish1.aplicarDano(90);
        System.out.println();
        kate.utilizarPoder("Rearrr Rocket", BadFish1);
        System.out.println();
        kate.utilizarPoder("Eye Beam", MadCat1);
        MadCat1.aplicarDano(60);
        System.out.println();
        kate.utilizarPoder("Super Bark", MadCat1);
        MadCat2.aplicarDano(50);
    }
}