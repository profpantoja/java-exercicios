package ex7;

import java.util.Scanner;

public class Sete {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcule as raizes de uma equação do segundo grau qualquer.");
        System.out.println("Digite o valor de 'a': ");
        float a = sc.nextFloat();
        System.out.println("Digite o valor de 'b': ");
        float b = sc.nextFloat();
        System.out.println("Digite o valor de 'c': ");
        float c = sc.nextFloat();
        float delta = (b*b)-4*a*c;
        if(delta == 0){
            System.out.println("A equação não possui nenhuma raiz real");
        }
        float raiz1 = (-b + (float) (Math.sqrt(delta))) / (2 * a);
        float raiz2 = (-b - (float) (Math.sqrt(delta))) / (2 * a);
        System.out.println("Raiz 1: " + raiz1);
        System.out.println("Raiz 2: " + raiz2);
        sc.close();

    }

   
}
