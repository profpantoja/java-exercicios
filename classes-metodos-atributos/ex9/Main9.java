package ex9;

import java.time.LocalDate;
import java.util.Scanner;

public class Main9 {

        private String nome;
        private String apelido;
        private LocalDate nascimentoData;


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            
            System.out.println("Digite o ano, o mês e o dia do seu nascimento: ");
            System.out.println("Ano: ");
            int ano = sc.nextInt();
            System.out.println("Mês: ");
            int mes = sc.nextInt();
            System.out.println("Dia: ");
            int dia = sc.nextInt();

            Idade idade = new Idade();
            idade.idade(ano, mes, dia);

            

            
            
            
        }
}
