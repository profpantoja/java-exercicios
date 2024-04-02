import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int nota1;
        int nota2;
        int media = 0;

        System.out.println("Digite a primeira nota do aluno:");
        nota1 = scan.nextInt();

        System.out.println("Digite a segunda nota do aluno:");
        nota2 = scan.nextInt();

        media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno foi reprovado!");
        }
    }
}
