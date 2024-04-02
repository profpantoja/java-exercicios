import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        double raiz1 = 0;
        double raiz2 = 0;
        double sqrtResultado = 0;
        double delta = 0;

        System.out.println("Digite o valor do coeficiente 'a':");
        a = scan.nextDouble();
        System.out.println("Digite o valor do coeficiente 'b':");
        b = scan.nextDouble();
        System.out.println("Digite o valor do coeficiente 'c':");
        c = scan.nextDouble();

        delta = (b * b) - (4 * (a *c));
        sqrtResultado = Math.sqrt(delta);

        if (a != 0) {
            if (delta >= 0) {
                raiz1 = (((-1) * b) - sqrtResultado) / (2 * a);
                raiz2 = (((-1) * b) + sqrtResultado) / (2 * a);
                System.out.println("X1 = " + raiz1);
                System.out.println("X2 = " + raiz2);
            } else {
                System.out.println("Por conta de delta ser menor que zero, suas raízes são complexas.");
            }
        } else {
            System.out.println("Valor de 'a' inválido para um operação de função de segundo grau.");
        }
    }

}
