import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Animal animal1 = new Animal("Kate", "2009-06-12", "Vira lata", "Preta", 35f);
        Pessoa pessoa1 = new Pessoa("Diana", null, null, null, 'f');
        Ficha ficha1 = new Ficha("2010-12-24", pessoa1, animal1);

        ficha1.verificacaoData();

        Animal animal2 = new Animal("Bob", "2010-10-09", "Bulldog", "Preta", 22f);
        Pessoa pessoa2 = new Pessoa("Louis", null, null, null, 'f');
        Ficha ficha2 = new Ficha("2011-03-20", pessoa2, animal2);

        ficha2.verificacaoData();

        Animal animal3 = new Animal("Pitty", "2007-03-02", "Pitbull", "Branca", 38f);
        Pessoa pessoa3 = new Pessoa("Bruce", null, null, null, 'm');
        Ficha ficha3 = new Ficha("2007-06-18", pessoa3, animal3);

        ficha3.verificacaoData();

        Animal animal4 = new Animal("Kelly", "2001-05-08", "Labrador", "Amarela", 36f);
        Pessoa pessoa4 = new Pessoa("Clark", null, null, null, 'm');
        Ficha ficha4 = new Ficha("2002-09-01", pessoa4, animal4);

        ficha4.verificacaoData();

        System.out.println("Gostaria de ver as informações de qual adoção (1 - 4)?");

        int resposta = scan.nextInt();

        // ADICIONEI AS NOVAS INFORMAÇÕES SOLICITADAS NA QUESTÃO 2!!!

        switch (resposta) {
            case 1:
                System.out.println("Informações da ficha 1:");
                System.out.println("Data de cadastro: " + ficha1.getAnimal().getChegada());
                ficha1.getAnimal().tempoONG(ficha1);
                System.out.println("Nome do animal: " + ficha1.getAnimal().getNome());
                System.out.println("Raça do animal: " + ficha1.getAnimal().getRaca());
                System.out.println("Cor do animal: " + ficha1.getAnimal().getCor());
                System.out.println("Peso do animal: " + ficha1.getAnimal().getPeso());
                System.out.println("Nome da pessoa: " + ficha1.getPessoa().getNome());
                System.out.println("Sexo da pessoa: " + ficha1.getPessoa().getSexo());
                System.out.println("Data de adoção: " + ficha1.getData());
                ficha1.getAnimal().nutrido();
                ficha1.tempoAdotado();
                System.out.println("Esse cão trocou de dono? (S ou N)");
                char trocaDono1 = scan.next().toUpperCase().charAt(0);
                scan.nextLine();
                if(trocaDono1 == 'S') {
                    System.out.println("Escreva o nome do novo dono:");
                    String nome = scan.nextLine();
                    System.out.println("Digite o gênero do novo dono (m/f): ");
                    char genero = scan.next().toLowerCase().charAt(0); 
                    Pessoa novoDono = new Pessoa(nome, null, null, null, genero);
                    ficha1.alterarDono(novoDono);
                }
                break;
            case 2:
                System.out.println("Informações da ficha 2:");
                System.out.println("Data de cadastro: " + ficha2.getAnimal().getChegada());
                ficha2.getAnimal().tempoONG(ficha2);
                System.out.println("Nome do animal: " + ficha2.getAnimal().getNome());
                System.out.println("Raça do animal: " + ficha2.getAnimal().getRaca());
                System.out.println("Cor do animal: " + ficha2.getAnimal().getCor());
                System.out.println("Peso do animal: " + ficha2.getAnimal().getPeso());
                System.out.println("Nome da pessoa: " + ficha2.getPessoa().getNome());
                System.out.println("Sexo da pessoa: " + ficha2.getPessoa().getSexo());
                System.out.println("Data de adoção: " + ficha2.getData());
                ficha2.getAnimal().nutrido();
                ficha2.tempoAdotado();
                System.out.println("Esse cão trocou de dono? (S ou N)");
                char trocaDono2 = scan.next().toUpperCase().charAt(0);
                scan.nextLine();
                if(trocaDono2 == 'S') {
                    System.out.println("Escreva o nome do novo dono:");
                    String nome = scan.nextLine();
                    System.out.println("Digite o gênero do novo dono (m/f): ");
                    char genero = scan.next().toLowerCase().charAt(0); 
                    Pessoa novoDono = new Pessoa(nome, null, null, null, genero);
                    ficha2.alterarDono(novoDono);
                }
                break;
            case 3:
                System.out.println("Informações da ficha 3:");
                System.out.println("Data de cadastro: " + ficha3.getAnimal().getChegada());
                ficha3.getAnimal().tempoONG(ficha3);
                System.out.println("Nome do animal: " + ficha3.getAnimal().getNome());
                System.out.println("Raça do animal: " + ficha3.getAnimal().getRaca());
                System.out.println("Cor do animal: " + ficha3.getAnimal().getCor());
                System.out.println("Peso do animal: " + ficha3.getAnimal().getPeso());
                System.out.println("Nome da pessoa: " + ficha3.getPessoa().getNome());
                System.out.println("Sexo da pessoa: " + ficha3.getPessoa().getSexo());
                System.out.println("Data de adoção: " + ficha3.getData());
                ficha3.getAnimal().nutrido();
                ficha3.tempoAdotado();
                System.out.println("Esse cão trocou de dono? (S ou N)");
                char trocaDono3 = scan.next().toUpperCase().charAt(0);
                scan.nextLine();
                if(trocaDono3 == 'S') {
                    System.out.println("Escreva o nome do novo dono:");
                    String nome = scan.nextLine();
                    System.out.println("Digite o gênero do novo dono (m/f): ");
                    char genero = scan.next().toLowerCase().charAt(0); 
                    Pessoa novoDono = new Pessoa(nome, null, null, null, genero);
                    ficha3.alterarDono(novoDono);
                }

                break;
            case 4:
                System.out.println("Informações da ficha 4:");
                System.out.println("Data de cadastro: " + ficha4.getAnimal().getChegada());
                ficha4.getAnimal().tempoONG(ficha4);
                System.out.println("Nome do animal: " + ficha4.getAnimal().getNome());
                System.out.println("Raça do animal: " + ficha4.getAnimal().getRaca());
                System.out.println("Cor do animal: " + ficha4.getAnimal().getCor());
                System.out.println("Peso do animal: " + ficha4.getAnimal().getPeso());
                System.out.println("Nome da pessoa: " + ficha4.getPessoa().getNome());
                System.out.println("Sexo da pessoa: " + ficha4.getPessoa().getSexo());  
                System.out.println("Data de adoção: " + ficha4.getData());
                ficha4.getAnimal().nutrido();  
                ficha4.tempoAdotado();
                System.out.println("Esse cão trocou de dono? (S ou N)");
                char trocaDono4 = scan.next().toUpperCase().charAt(0);
                scan.nextLine();
                if(trocaDono4 == 'S') {
                    System.out.println("Escreva o nome do novo dono:");
                    String nome = scan.nextLine();
                    System.out.println("Digite o gênero do novo dono (m/f): ");
                    char genero = scan.next().toLowerCase().charAt(0); 
                    Pessoa novoDono = new Pessoa(nome, null, null, null, genero);
                    ficha4.alterarDono(novoDono);
                }
                break;
            default:
                System.out.println("Essa ficha não existe!");
                break;
        }
        
    }
}