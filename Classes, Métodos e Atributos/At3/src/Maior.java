
import java.util.Scanner;

public class Maior {
    public float x;
    public float maior;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("insira o primeriro valor:");
        float x = entrada.nextFloat();
        float maior = x;

        System.out.println("Insira outro valor");
        x = entrada.nextFloat();

        if (x>maior){
            maior = x;
        }else {}

        System.out.println("insira outro valor:");
        x = entrada.nextFloat();

        if (x>maior){
            maior= x;

        }else{}

        System.out.println("o maior valor é:" + maior);

        
        System.exit(0);
    }




}
