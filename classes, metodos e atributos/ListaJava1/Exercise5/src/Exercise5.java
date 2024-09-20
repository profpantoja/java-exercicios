import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int aleatorio = random.nextInt(101);
        int num, i, tentativas = 0;

        for(i = 0; i <= tentativas; i++){

            System.out.println("Digite um numero para adivinhar (Min = 0/Max = 100): ");
            num = in.nextInt();
            tentativas++;

            if(num == aleatorio){
                    System.out.println("Parabens! Você acertou!");
                    break;
            }
            else if (num > aleatorio){
                System.out.println("O numero digitado é maior que o numero desconhecido!");
            }
            else{
                System.out.println("O numero é menor que o numero desconhecido");
            }
        }

        if(tentativas == 1){
            System.out.println("Voce é excelente!");
        }
        else if(tentativas <= 10){
            System.out.println("Voce é bom!");
        }
        else if(tentativas > 10 && tentativas <= 20){
            System.out.println("Você não foi tao bem!");
        }
        else{
            System.out.println("Você precisa praticar mais!");
        }

        System.out.println("Tentativas: " + tentativas);
        in.close();
        
    }
}
