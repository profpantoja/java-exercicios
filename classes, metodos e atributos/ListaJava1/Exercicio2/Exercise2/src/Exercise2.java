import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite a primeira nota (min = 0/max = 10): ");
        nota1 = in.nextDouble();
        System.out.println("Digite a segunda nota (min = 0/max = 10): ");
        nota2 = in.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("Media: " + media);
        
        if(media >= 6){
            System.out.println("Voce foi aprovado!");
        } else if (media < 2) {
            System.out.println("Voce foi reprovado!");
        } else{
            System.out.println("Voce esta de prova final!");
        }
        
        in.close();
    }
}
