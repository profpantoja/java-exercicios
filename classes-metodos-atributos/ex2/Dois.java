package ex2;

import java.util.Scanner;

public class Dois {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int nota1 = 0;
        int nota2 = 0;

        System.out.println("Nota 1: ");
        nota1 = sc.nextInt();
        if(nota1 > 10){
            while(nota1 > 10){
                System.out.println("A nota deve ser menor que 10: ");
                nota1 = sc.nextInt();
            }
        }

        System.out.println("Nota 2: ");
        nota2 = sc.nextInt();
        if(nota2 > 10){
            while(nota2 > 10){
                System.out.println("A nota deve ser menor que 10: ");
                nota2 = sc.nextInt();
            }
        }

        sc.close();
      
        float media = (nota1 + nota2) / 2;

        if(media >= 6){
            System.out.println("Aprovado!");
        }else if(media >= 2 && media < 6){
            System.out.println("Prova final!");
        }else{
           System.out.println("Reprovado!");
        }

    }

}
