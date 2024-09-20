import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        Bhaskara conta = new Bhaskara();
        double a, b, c, raiz1, raiz2, delta;

            System.out.println("Digite o valor de a: ");
            a = in.nextDouble();
            System.out.println("Digite o valor de b: ");
            b = in.nextDouble();
            System.out.println("Digite o valor de c: ");
            c = in.nextDouble();

        delta = conta.getDelta(a, b, c);
        raiz1 = conta.getRaizX1(a, b, delta);
        raiz2 = conta.getRaizX2(a, b, delta);
        
        System.out.println (raiz1);
        System.out.println(raiz2);
        
        in.close();
    }

}
