import java.util.Scanner;

public class baskara {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double a;
        double b = 0;
        double c;
        double delta;
        double x1;
        double x2;

        System.out.print("Digite o valor de a: ");
        a = scanner.nextDouble();
        System.out.print("Digite o valor de b: ");
        b = scanner.nextDouble();
        System.out.print("Digite o valor de c: ");
        c = scanner.nextDouble();
        

        delta = (b*b)-4*a*c;

       
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("As raízes são reais e diferentes.");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        


    }


}
