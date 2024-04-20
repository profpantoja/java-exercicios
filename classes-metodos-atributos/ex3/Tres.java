package ex3;

import java.util.Scanner;

public class Tres {

    public static void main(String[] args) throws Exception {
        
        int maior = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i < 4; i++){
            System.out.println("Número " + i + ":");
            int num = sc.nextInt();
            if(i == 1){
                num = maior;
            }
        
            if(num > maior){
                maior = num;
            }
        }      
        System.out.println("Maior número: " + maior);
        sc.close();
    }

}
