
package At2;

import java.util.Scanner;



public class media {
    
    public float n1;
    public float n2;
    public float media;

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("insira o valor de n1:");

        float n1 = entrada.nextFloat();
        
        if (n1>10 || n1<0){
            do{
                System.out.println("Insira um valor valido:");
                n1 = entrada.nextFloat();

            }while (n1>10 || n1<0);
    }else{}


        System.out.println("insira o valor de n2:");
        float n2 = entrada.nextFloat();

        if (n2>10 || n2<0){
            do{
                System.out.println("Insira um valor valido:");
                n2 = entrada.nextFloat();

            }while (n1>11 || n1<0);
        }else{}

        float media =  (n1+n2)/2;

        System.out.println(media);

        if (media >6){
            System.out.println("Aprovado");
        }else if(media<2){
            System.out.println("Reprovado");
        }else if (media>2 && media<6){
            System.out.println("PF");
        }

        System.exit(0);
    }
}
