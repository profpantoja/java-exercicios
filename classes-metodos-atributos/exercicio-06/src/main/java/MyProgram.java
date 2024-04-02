import java.util.Random;
import java.util.Scanner;

public class MyProgram {
    
    public static void main(String[] args) {
        
        boolean acertou = false;
        int i = 0;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int numeroSorteado = random.nextInt(100);
        int numero;
        int tentativas = 0;

        System.out.println("Tente advinhar o numero que sorteei.");
        System.out.println("Caso o seu número digitado seja maior que o sorteado, aparecerá 'Máx = numero digitado'");
        System.out.println("Caso o seu número digitado seja menor que o sorteado, aparecerá 'Min = numero digitado'");

        while (!acertou) {
            i++;
            System.out.println("Digite um número de 0 a 100");
            numero = scan.nextInt();
            if (numero > numeroSorteado) {
                System.out.println("Máx = " + numero);
            } else if (numero < numeroSorteado) {
                System.out.println("Min = " + numero);
            } else {
                System.out.println("Parabéns, o número sorteado foi: " + numero);
                System.out.println("O número total de tentativas foi: " + i);
                tentativas = i;
                acertou = true;
            }
        }

        if (tentativas == 1) {
            System.out.println("Você é excelente!");
        } else if (tentativas <= 10) {
            System.out.println("Você é bom.");
        } else if (tentativas > 10 && tentativas <= 20) {
            System.out.println("Você não foi tão bem."); 
        } else if (tentativas > 20) {
            System.out.println("Você precisa praticar.");
        }
    }
}
