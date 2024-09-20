import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Pessoa usuario = new Pessoa("Rafael", "Rafinha");
    int dia, mes, ano;
    int diaA, mesA, anoA;

    System.out.println("Digite o dia que nasceu: ");
    dia = in.nextInt();
    System.out.println("Digite o mes que nasceu. (Se nasceu em janeiro digite 1 e assim por diante): ");
    mes = in.nextInt();
    System.out.println("Digite o ano que nasceu: ");
    ano = in.nextInt();

    System.out.println("Digite o dia atual: ");
    diaA = in.nextInt();
    System.out.println("Digite o mes atual. (Se nasceu em janeiro digite 1 e assim por diante): ");
    mesA = in.nextInt();
    System.out.println("Digite o ano atual: ");
    anoA = in.nextInt();

    usuario.setData(dia, mes, ano);
    usuario.setIdade(diaA, mesA, anoA);

    System.out.println("Nome: " + usuario.getNome());
    System.out.println("Apelido: " + usuario.getApelido());
    System.out.println("Idade: " + usuario.getIdade());
    in.close();
    }
}
