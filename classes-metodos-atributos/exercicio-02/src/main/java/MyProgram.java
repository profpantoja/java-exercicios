import java.util.Scanner;

public class MyProgram {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        boolean respostaValida = false;
        double nota1 = 0;
        double nota2 = 0;
        double media = 0;
        double notaPF = 0;
        double mediaPF = 0;

        while (!respostaValida) {
            System.out.println("Digite a primeira nota do aluno: ");
            nota1 = scan.nextDouble();
            System.out.println("Digite a segunda nota do aluno: ");
            nota2 = scan.nextDouble();
            if (nota1 > 10 || nota2 > 10) {
                System.out.println("Só permitimos notas menores ou iguais a 10. Tente novamente");
            } else {
                respostaValida = true;
            }
        }

        media = (nota1 + nota2) / 2;
        if (media >= 6) {
            System.out.println("O aluno está aprovado!");
            System.out.print("Media: ");
            System.out.println(media);
        } else if (media < 2) {
            System.out.println("O aluno está reprovado, sem direito a prova final.");
            System.out.print("Media: ");
            System.out.println(media);
        } else {
            System.out.println("O aluno está de Prova Final!");
            System.out.print("Media: ");
            System.out.println(media);
            System.out.println("Digite a nota da Prova Final:");
            notaPF = scan.nextDouble();
            mediaPF = (media + notaPF) / 2;
            if (mediaPF>= 6) {
                System.out.println("Aluno aprovado com media: " + mediaPF);
            } else {
                System.out.println("Aluno reprovado.");
            }
        }
    }
}