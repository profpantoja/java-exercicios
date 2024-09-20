
import java.util.Scanner;


public class Media {
    
    public float n1;
    public float n2;
    public float media;


    public static void main(String[] args) {
        System.out.println("insira o valor da primeira nota");

        Scanner entrada = new Scanner(System.in);

        float n1 = entrada.nextFloat();

        System.out.println("insira a segunda nota");
        
        float n2 = entrada.nextFloat();
        
        float media = (n1+n2)/2;

        System.out.println("a media é: " + media);

        if (media>7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        entrada.close();

    }

}
