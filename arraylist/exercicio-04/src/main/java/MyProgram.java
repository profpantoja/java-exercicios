import java.util.ArrayList;
import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<String> racaAnimais = new ArrayList<String>();
        ArrayList<Float> pesoAnimais = new ArrayList<Float>();
        ArrayList<String> corAnimais = new ArrayList<String>();

        Animal animal1 = new Animal("Kate", "12/06/2009", "Vira lata", "Preta", 35f);
        Pessoa pessoa1 = new Pessoa("Diana", null, null, null, 'f');
        Ficha ficha1 = new Ficha("24/12/2010", pessoa1, animal1);

        Animal animal2 = new Animal("Bob", "09/10/2010", "Bulldog", "Preta", 22f);
        Pessoa pessoa2 = new Pessoa("Louis", null, null, null, 'f');
        Ficha ficha2 = new Ficha("20/03/2011", pessoa2, animal2);

        Animal animal3 = new Animal("Pitty", "02/03/2007", "Pitbull", "Branca", 38f);
        Pessoa pessoa3 = new Pessoa("Bruce", null, null, null, 'm');
        Ficha ficha3 = new Ficha("18/06/2000", pessoa3, animal3);

        Animal animal4 = new Animal("Kelly", "08/05/2001", "Labrador", "Amarela", 36f);
        Pessoa pessoa4 = new Pessoa("Clark", null, null, null, 'm');
        Ficha ficha4 = new Ficha("01/09/2002", pessoa4, animal4);

        Animal animal5 = new Animal("Peixe", "09/11/2008", "Vira lata", "Amarela", 20f);

        Animal animal6 = new Animal("Grazi", "12/12/2012", "Pastor", "Amarela", 18f); 

        racaAnimais.add(animal1.getRaca());
        racaAnimais.add(animal2.getRaca());
        racaAnimais.add(animal3.getRaca());
        racaAnimais.add(animal4.getRaca());
        racaAnimais.add(animal5.getRaca());
        racaAnimais.add(animal6.getRaca());

        pesoAnimais.add(animal1.getPeso());
        pesoAnimais.add(animal2.getPeso());
        pesoAnimais.add(animal3.getPeso());
        pesoAnimais.add(animal4.getPeso());
        pesoAnimais.add(animal5.getPeso());
        pesoAnimais.add(animal6.getPeso());
        
        corAnimais.add(animal1.getCor());
        corAnimais.add(animal2.getCor());
        corAnimais.add(animal3.getCor());
        corAnimais.add(animal4.getCor());
        corAnimais.add(animal5.getCor());
        corAnimais.add(animal6.getCor());

        System.out.println("Escolha uma das funções abaixo: ");
        System.out.println("1 - Numero de cachorros desnutridos");
        System.out.println("2 - Numero de vira latas");
        System.out.println("3 - Numero de cachorros amarelos");
       
        int op = scan.nextInt();

        switch (op) {
            case 1:
                Animal desnutridoOuNao = new Animal();
                desnutridoOuNao.nutricaoAnimal(pesoAnimais);
                break;
            case 2:
                Animal contando = new Animal();
                contando.viraLatas(racaAnimais); 
                break;
            case 3:
                Animal cores = new Animal();
                cores.animaisAmarelos(corAnimais);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

    }
}