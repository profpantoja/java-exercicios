import java.util.ArrayList;
import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<String> nomesAnimais = new ArrayList<String>();
        ArrayList<String> racaAnimais = new ArrayList<String>();
        ArrayList<String> tempoAdocao = new ArrayList<String>();

        Animal animal1 = new Animal("Kate", "12/06/2009", "Vira lata", "Preta", 35f);
        Pessoa pessoa1 = new Pessoa("Diana", null, null, null, 'f');
        Ficha ficha1 = new Ficha("24/12/2010", pessoa1, animal1);

        Animal animal2 = new Animal("Bob", "09/10/2010", "Bulldog", "Preta", 22f);
        Pessoa pessoa2 = new Pessoa("Louis", null, null, null, 'f');
        Ficha ficha2 = new Ficha("20/03/2011", pessoa2, animal2);

        Animal animal3 = new Animal("Pitty", "02/03/2007", "Pitbull", "Branca", 38f);
        Pessoa pessoa3 = new Pessoa("Bruce", null, null, null, 'm');
        Ficha ficha3 = new Ficha("18/06/2003", pessoa3, animal3);

        Animal animal4 = new Animal("Kelly", "08/05/2001", "Labrador", "Amarela", 36f);
        Pessoa pessoa4 = new Pessoa("Clark", null, null, null, 'm');
        Ficha ficha4 = new Ficha("01/09/2002", pessoa4, animal4);

        nomesAnimais.add(animal1.getNome());
        nomesAnimais.add(animal2.getNome());
        nomesAnimais.add(animal3.getNome());
        nomesAnimais.add(animal4.getNome());

        racaAnimais.add(animal1.getRaca());
        racaAnimais.add(animal2.getRaca());
        racaAnimais.add(animal3.getRaca());
        racaAnimais.add(animal4.getRaca());

        tempoAdocao.add(ficha1.getData());
        tempoAdocao.add(ficha2.getData());
        tempoAdocao.add(ficha3.getData());
        tempoAdocao.add(ficha4.getData());

        System.out.println("Escolha uma das funções abaixo: ");
        System.out.println("1 - Busca de animais");
        System.out.println("2 - Cachorro com mais tempo de adotado");
        System.out.println("3 - Numero de vira latas adotados");
       
        int op = scan.nextInt();
        scan.nextLine();

        switch (op) {
            case 1:
                System.out.println("Digite o nome do animal");
                String busca = scan.nextLine();
    
                Animal buscando = new Animal();
                buscando.procuraNome(nomesAnimais, busca);       
                break;
            case 2:
                Ficha.comparandoDatas(tempoAdocao);
                break;
            case 3:
                Animal contando = new Animal();
                contando.viraLatas(racaAnimais); 
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

    }
}