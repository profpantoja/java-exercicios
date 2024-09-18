package ex6;

import java.util.Random;
import java.util.Scanner;

public class Seis {
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

        if(cont == 1){
            String nivel = "Você é excelente!";
            System.out.println("Você acertou com " + cont + " tentativa(s). " + nivel);           
        }else if(cont == 10){
            String nivel = "Você é bom!";
            System.out.println("Você acertou com " + cont + " tentativa(s). " + nivel);           
        }else if(cont > 10 && cont < 20){
            String nivel = "Você não foi muito bem!";
            System.out.println("Você acertou com " + cont + " tentativa(s). " + nivel);   
        }else{
            String nivel = "Você precisa praticar!";
            System.out.println("Você acertou com " + cont + " tentativa(s). " + nivel);
        }          
        sc.close();
    }
}
