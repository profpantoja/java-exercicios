import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Entre com a primeira nota:");
        nota1 = in.nextDouble();

        System.out.println("Entre com a segunda nota:");
        nota2 = in.nextDouble();

        media = (nota1 + nota2) / 2;

        if(media >= 7){
            System.out.println("Você passou!");
        }
        else{
            System.out.println("Você não passou!");
        }
        in.close();

    }

}