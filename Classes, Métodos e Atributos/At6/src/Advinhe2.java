
import java.util.Scanner;

public class Advinhe2 {
    
    public static void main(String[] args) {
        
        int adv;
        int player;
        int tentativas = 0;


       Scanner entrada = new Scanner(System.in);
        System.out.println("INSIRA UM VALOR ENTRE 0 E 100:");
        
        adv = entrada.nextInt();

        do {
            System.out.println("jogador insira um numero");
            player = entrada.nextInt();
            tentativas++;
            if (player==adv){
                System.out.println("Você ganhou com "+ tentativas + " tentativas");
            }else if (player>adv){
                System.out.println("max = numero do jogador");
            }else if(player<adv){
                System.out.println("min = numero do jogador");
            }

        }while (player!=adv);

        if (tentativas==1){
            System.out.println("Você é excelente:");
        }else if (tentativas >1 && tentativas <11){
            System.out.println("Você é bom");
        }else if (tentativas>10 && tentativas<21){
            System.out.println("VocÊ não foi tão bem.");
        }else if (tentativas>20){
            System.out.println("Você precisa praticar");
        }







        System.exit(0);
    }
    
}
