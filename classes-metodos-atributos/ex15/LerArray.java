package ex15;

import java.util.Scanner;

public class LerArray {
    
    public static int[] lerArray(){
        
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Tamanho do Array: ");
        int tamanho = sc1.nextInt();

        int[] array = new int[tamanho];

        System.out.println("Digite " + tamanho + " números: " );
        
        for(int i = 0; i < array.length; i++){
            array[i] = sc1.nextInt();
        }

        sc1.close();
        return array;
    }
    
}
