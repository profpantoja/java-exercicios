import java.util.Scanner;

public class MyProgram {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valor1 = 0;
        int valor2 = 0;
        int valor3 = 0;

        System.out.println("Digite um primeiro valor:");
        valor1 = scan.nextInt();
        System.out.println("Digite um segundo valor, sendo diferente de algum outro digitado:");
        valor2 = scan.nextInt();
        System.out.println("Digite um terceiro valor, sendo diferente de algum outro digitado:");
        valor3 = scan.nextInt();

        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("O primeiro valor (" + valor1 + ") é o maior valor digitado!");
        } else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("O segundo valor (" + valor2 + ") é o maior valor digitado!");
        } else {
            System.out.println("O terceiro valor (" + valor3 + ") é o maior valor digitado!");
        }

    }
    
}
