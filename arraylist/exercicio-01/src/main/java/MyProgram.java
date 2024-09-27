import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Animal animal1 = new Animal("Kate", "12/06/2009", "Vira lata", "Preta", 35f);
        Pessoa pessoa1 = new Pessoa("Diana", null, null, null, 'f');
        Ficha ficha1 = new Ficha("24/12/2010", pessoa1, animal1);

        Animal animal2 = new Animal("Bob", "09/10/2010", "Bulldog", "Preta", 22f);
        Pessoa pessoa2 = new Pessoa("Louis", null, null, null, 'f');
        Ficha ficha2 = new Ficha("20/03/2011", pessoa2, animal2);

        Animal animal3 = new Animal("Pitty", "02/03/2007", "Pitbull", "Branca", 38f);
        Pessoa pessoa3 = new Pessoa("Bruce", null, null, null, 'm');
        Ficha ficha3 = new Ficha("18/06/2007", pessoa3, animal3);

        Animal animal4 = new Animal("Kelly", "08/05/2001", "Labrador", "Amarela", 36f);
        Pessoa pessoa4 = new Pessoa("Clark", null, null, null, 'm');
        Ficha ficha4 = new Ficha("01/09/2002", pessoa4, animal4);

        System.out.println("Gostaria de ver as informações de qual adoção (1 - 4)?");

        int resposta = scan.nextInt();

        switch (resposta) {
            case 1:
                System.out.println("Informações da ficha 1:");
                System.out.println("Data de cadastro: " + ficha1.getAnimal().getChegada());
                System.out.println("Nome do animal: " + ficha1.getAnimal().getNome());
                System.out.println("Raça do animal: " + ficha1.getAnimal().getRaca());
                System.out.println("Cor do animal: " + ficha1.getAnimal().getCor());
                System.out.println("Peso do animal: " + ficha1.getAnimal().getPeso());
                System.out.println("Nome da pessoa: " + ficha1.getPessoa().getNome());
                System.out.println("Sexo da pessoa: " + ficha1.getPessoa().getSexo());
                System.out.println("Data de adoção: " + ficha1.getData());
                break;
            case 2:
                System.out.println("Informações da ficha 2:");
                System.out.println("Data de cadastro: " + ficha2.getAnimal().getChegada());
                System.out.println("Nome do animal: " + ficha2.getAnimal().getNome());
                System.out.println("Raça do animal: " + ficha2.getAnimal().getRaca());
                System.out.println("Cor do animal: " + ficha2.getAnimal().getCor());
                System.out.println("Peso do animal: " + ficha2.getAnimal().getPeso());
                System.out.println("Nome da pessoa: " + ficha2.getPessoa().getNome());
                System.out.println("Sexo da pessoa: " + ficha2.getPessoa().getSexo());
                System.out.println("Data de adoção: " + ficha2.getData());
                break;
            case 3:
                System.out.println("Informações da ficha 3:");
                System.out.println("Data de cadastro: " + ficha3.getAnimal().getChegada());
                System.out.println("Nome do animal: " + ficha3.getAnimal().getNome());
                System.out.println("Raça do animal: " + ficha3.getAnimal().getRaca());
                System.out.println("Cor do animal: " + ficha3.getAnimal().getCor());
                System.out.println("Peso do animal: " + ficha3.getAnimal().getPeso());
                System.out.println("Nome da pessoa: " + ficha3.getPessoa().getNome());
                System.out.println("Sexo da pessoa: " + ficha3.getPessoa().getSexo());
                System.out.println("Data de adoção: " + ficha3.getData());
                break;
            case 4:
                System.out.println("Informações da ficha 4:");
                System.out.println("Data de cadastro: " + ficha4.getAnimal().getChegada());
                System.out.println("Nome do animal: " + ficha4.getAnimal().getNome());
                System.out.println("Raça do animal: " + ficha4.getAnimal().getRaca());
                System.out.println("Cor do animal: " + ficha4.getAnimal().getCor());
                System.out.println("Peso do animal: " + ficha4.getAnimal().getPeso());
                System.out.println("Nome da pessoa: " + ficha4.getPessoa().getNome());
                System.out.println("Sexo da pessoa: " + ficha4.getPessoa().getSexo());  
                System.out.println("Data de adoção: " + ficha4.getData());  
                break;
            default:
                System.out.println("Essa ficha não existe!");
                break;
        }

    }
}