import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n1, n2, n3, maior = 0;

        System.out.println("Digite o primeiro numero: ");
        n1 = in.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = in.nextInt();
        System.out.println("Digite o terceiro numero: ");
        n3 = in.nextInt();

        if(n1 >= n2 && n1 >=n3){
            maior = n1;
        }
        if(n2 >= n1 && n2 >= n3){
            maior = n2;
        }
        if(n3 >= n1 && n3 >= n2){
            maior = n3;
        }

        System.out.println("Maior numero: " + maior);

        in.close();
    }
}
