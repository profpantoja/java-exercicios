package ex5;

import java.util.Random;
import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) throws Exception {
        
        int cont = 1;
        
        Random r = new Random();
        int numAleatorio = r.nextInt(100) + 1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um numero de 0 a 100: ");
        int escolhaDoUsuario = sc.nextInt();
        
        while(escolhaDoUsuario != numAleatorio){
            if(escolhaDoUsuario == numAleatorio){
                System.out.println("Você acertou!");
            }else if(escolhaDoUsuario < numAleatorio){
                System.out.println("O número sorteado é maior que " + escolhaDoUsuario);
            }else if(escolhaDoUsuario > numAleatorio){
                System.out.println("O número sorteado é menor que " + escolhaDoUsuario);
            }
            System.out.println("Tente novamente!");
            escolhaDoUsuario = sc.nextInt();
            cont++;
        }
        System.out.println("Você acertou com " + cont + " tentativa(s)");        
        sc.close();
    }
}
