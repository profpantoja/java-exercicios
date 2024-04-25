package ArrayList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {

        ArrayList<Fichas> adocoes = new ArrayList<Fichas>();
        ArrayList<Cao> todosCaes = new ArrayList<Cao>();

        Cao Kate = new Cao("Kate", LocalDate.of(2009, 6, 2), "Vira Lata", "Preta", 35.00);
        Cao Bob = new Cao("Bob", LocalDate.of(2010, 10, 9), "Bulldog", "Preta", 22.00);
        Cao Pitty = new Cao("Pitty", LocalDate.of(2007, 3, 12), "Pitbull", "Branca", 38.00);
        Cao Kelly = new Cao("Kelly", LocalDate.of(2001, 5, 8), "Labrador", "Amarela", 36.00);
        Cao Peixe = new Cao("Peixe", LocalDate.of(2008, 11, 9), "Vira Lata", "Amarela", 20.00);
        Cao Grazi = new Cao("Grazi", LocalDate.of(2012, 12, 12), "Pastor", "Amarela", 18.00);

        Pessoa Diana = new Pessoa("Diana", "Rj, rua: 1, casa: 1, cep: 12345678", 91234567, "diana@gmail.com", "Feminino", Kate);
        Pessoa Louis = new Pessoa("Louis", "Rj, rua: 2, casa: 2, cep: 31345678", 98534567, "louis@gmail.com", "Masculino", Bob);
        Pessoa Bruce = new Pessoa("Bruce", "Rj, rua: 3, casa: 3, cep: 89345678", 92534567, "bruce@gmail.com", "Masculino", Pitty);
        Pessoa Clark = new Pessoa("Clark", "Rj, rua: 4, casa: 4, cep: 65345678", 91434567, "clark@gmail.com", "Masculino", Kelly);

        Fichas adocaoKate = new Fichas(LocalDate.of(2010, 12, 24), Kate, Diana);
        Fichas adocaoBob = new Fichas(LocalDate.of(2011, 3, 20), Bob, Louis);
        Fichas adocaoPitty = new Fichas(LocalDate.of(2007, 6, 18), Pitty, Bruce);
        Fichas adocaoKelly = new Fichas(LocalDate.of(2002, 9, 1), Kelly, Clark);
       
        adocaoKate.periodoNaONG();
        adocaoKate.periodoAdotado();
        adocaoKate.nutricao();

        adocaoBob.periodoNaONG();
        adocaoBob.periodoAdotado();
        adocaoBob.nutricao();

        adocaoPitty.periodoNaONG();
        adocaoPitty.periodoAdotado();
        adocaoPitty.nutricao();

        adocaoKelly.periodoNaONG();
        adocaoKelly.periodoAdotado();
        adocaoKelly.nutricao();

        adocoes.add(adocaoKate);
        adocoes.add(adocaoBob);
        adocoes.add(adocaoPitty);
        adocoes.add(adocaoKelly);

        todosCaes.add(Kate);
        todosCaes.add(Bob);
        todosCaes.add(Pitty);
        todosCaes.add(Kelly);
        todosCaes.add(Peixe);
        todosCaes.add(Grazi);

        for(Fichas tempoAdotado : adocoes){
            System.out.println("O cão " + tempoAdotado.getCaoAdotado().getNome() + " está adotado por "  + tempoAdotado.periodoAdotado().getDays() + " dia(s), " + tempoAdotado.periodoAdotado().getMonths() + " mes(es) e " + tempoAdotado.periodoAdotado().getYears() + " ano(s)");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome para Buscar.");
        String nome = sc.nextLine();
        for(Fichas nomes : adocoes){
            if(nomes.getCaoAdotado().getNome().equals(nome)){
                System.out.println("O cão " + nomes.getCaoAdotado().getNome() + " está cadastrado\n");
            }
        }
     
        int maior = 0;
        String nomeMaior = " ";
        for(Fichas tempoAdotado : adocoes){
             maior = tempoAdotado.periodoAdotado().getYears();
             nomeMaior = tempoAdotado.getCaoAdotado().getNome();
             if(tempoAdotado.periodoAdotado().getYears() > maior){
                maior = tempoAdotado.periodoAdotado().getYears();
                nomeMaior = tempoAdotado.getCaoAdotado().getNome();
                
            }          
        }
        System.out.println(nomeMaior + " está com o maior tempo adotado\n");

        int cont = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
           
        for(Fichas viraLata : adocoes){
            if(viraLata.getCaoAdotado().getRaca().equals("Vira Lata")){
                cont++;
            }   
        }
        System.out.println("Número de Vira Lata(s) adotodo(s): " + cont + "\n");

        for(Cao desnutridos : todosCaes){
            if(desnutridos.getPeso() >= 0.0 && desnutridos.getPeso() <= 20.0){
                cont2++;
            }

        }
        System.out.println(cont2 + " cão(es) Desnutridos");

        for(Cao viraLatas : todosCaes){
            if(viraLatas.getRaca().equals("Vira Lata")){
                cont3++;

            }
        }
        System.out.println(cont3 + " são Vira Latas.");

        for(Cao viraLatas : todosCaes){
            if(viraLatas.getCor().equals("Amarela")){
                cont4++;

            }
        }
        System.out.println(cont4 + " são Amarelos.");
        sc.close();
    }

}
