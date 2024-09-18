package ex12;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Cryptographye message = new Cryptographye();

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a code: ");
        String code = sc.nextLine();
        message.encrypt(code);
        System.out.println("\n-----");
        message.decrypt(code);
        sc.close();
        
        
    }
    
}
