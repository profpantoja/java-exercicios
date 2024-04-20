package ex8;

public class Oito {

    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.setQuilometragem(101.10);
        carro1.addQuilometragem(103.10);
        System.out.println(carro1.getQuilometragem());
    }


}
