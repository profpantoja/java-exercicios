package org.example2;

public class Main {
    public static void main(String[] args) {
        Kate kate = new Kate(100, 3);
        BadFish badFish1 = new BadFish(50);
        BadFish badFish2 = new BadFish(50);
        BadFish badFish3 = new BadFish(50);
        MadCat madCat1 = new MadCat(70);
        MadCat madCat2 = new MadCat(70);

        Poder superBark = new SuperBark();
        Poder eyeBeam = new EyeBeam();
        Poder rearRocket = new RearRocket();

        kate.adicionarPoder(superBark);
        kate.adicionarPoder(eyeBeam);
        kate.adicionarPoder(rearRocket);

        kate.trocarPoder(0);
        kate.usarPoder(badFish1);

        kate.trocarPoder(2);
        kate.usarPoder(badFish1);

        kate.trocarPoder(0);
        kate.usarPoder(badFish1);
        kate.usarPoder(badFish1);
        kate.usarPoder(badFish1);





    }
}