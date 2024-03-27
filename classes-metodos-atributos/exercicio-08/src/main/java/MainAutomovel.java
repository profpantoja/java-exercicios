package src.main.java;
public class MainAutomovel {
    
    public static void main(String[] args) {

    Automovel carro1 = new Automovel("Fiat", "Uno", 2013, 2015, "branco", 10);
    Automovel carro2 = new Automovel("Renoult", "kwid", 2017, 2020,"cinza", 35);
    Automovel carro3 = new Automovel("Ford", "Wolkswagen", 2014);

    System.out.println("Carro 3: \n" + carro3.getMarca() +"\n"+ carro3.getModelo()+"\n"+carro3.getAno_fabricacao()+"\n");

    carro1.AddKm(40.2f);
    carro2.AddKm(30.5f);

    carro1.setMarca("Honda");
    System.out.println(carro1.getMarca());

    System.out.println("\nQuilometragem total carro 1: " + carro1.KmTotal());
    System.out.println("Quilometragem total carro 2: " +carro2.KmTotal()+"\n");

    carro1.VelMedia(252, 152);
    carro2.VelMedia(42, 35);

    carro1.Acelerar(carro1.getMarca());
    carro2.Freiar(carro2.getMarca());
    carro1.Direita(carro1.getMarca());
    carro2.Esquerda(carro2.getMarca());
    
    }
}