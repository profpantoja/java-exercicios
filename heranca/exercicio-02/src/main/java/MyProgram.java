public class MyProgram {

    public static void main(String[] args) {

        Kate kate = new Kate();
        kate.setEnergia("alta");
        kate.getPoder();
        
        kate.setQuantidadeVidas(3);
        kate.setPoder("SuperBark");
        kate.setPoder("EyeBeam");
        kate.setPoder("RearRocket");



        BadFish badfish1 = new BadFish();
        badfish1.setEnergia("metade");

        BadFish badfish2 = new BadFish();
        badfish2.setEnergia("baixa");

        BadFish badfish3 = new BadFish();
        badfish3.setEnergia("total");

        MadCat madcat1 = new MadCat();
        madcat1.setEnergia("alta");
        
        MadCat madcat2 = new MadCat();
        madcat2.setEnergia("baixa");


    }
}