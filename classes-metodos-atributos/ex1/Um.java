package ex1;

import java.util.Scanner;

public class Um {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        int nota1 = sc.nextInt();        
        
        System.out.println("Informe a segunda nota: ");
        int nota2 = sc.nextInt();

        sc.close();
          
        float media = (nota1 + nota2) / 2;

        if(media >= 7){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }

    }

}
