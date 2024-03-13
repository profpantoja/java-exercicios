package main.java;
import java.util.Date;

@SuppressWarnings("deprecation")

public class Main {
    public static void main(String[] args) {
        Date dataNascimento = new Date(103, 11, 18);

        Idade idade1 = new Idade("Felipe", "Feh", dataNascimento);
        
        int idade = idade1.getIdade();
        System.out.println("Idade: " + idade + " anos");
        
    }
}
