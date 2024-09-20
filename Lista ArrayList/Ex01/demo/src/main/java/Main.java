import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Pet p1 = new Pet("Kate", LocalDate.parse("12/06/2009", fmt),"Vira Lata","Preta", 35.0, "Cachorro");
        Pet p2 = new Pet("Bob", LocalDate.parse("09/10/2010", fmt), "Bulldog", "Preto", 22.0, "Cachorro");
        Pet p3 = new Pet("Pitty", LocalDate.parse("02/03/2007", fmt),"Pitbull", "Branco", 38.0, "Cachorro");
        Pet p4 = new Pet("Kelly", LocalDate.parse("08/05/2001", fmt), "Labrador", "Amarelo", 36.0, "Cachorro");
        Pet p5 = new Pet("Peixe", LocalDate.parse("09/11/2008", fmt), "Vira Lata", "Amarelo", 20.0, "Cachorro");
        Pet p6 = new Pet("Grazi", LocalDate.parse("12/12/2012", fmt), "Pastor", "Amarelo", 18.0, "Cachorro");

        Pessoa c1 = new Pessoa("Diana", "Volta Redonda", "(21)97876-1653", "diana@gmail.com", "Feminino");
        Pessoa c2 = new Pessoa("Louis", "Niteroi", "(21)56437.8690", "louis@gmail.com", "Feminino");
        Pessoa c3 = new Pessoa("Bruce", "Rio de Janeiro", "(21)56321.3482", "bruce@gmail.com", "Masculino");
        Pessoa c4 = new Pessoa("Clark", "Buzios", "(21)90453.5438", "clark@gmail.com", "Masculino");

        Ficha f1 = new Ficha(LocalDate.parse("24/02/2010",fmt), p1, c1);
        Ficha f2 = new Ficha(LocalDate.parse("20/03/2011",fmt), p2, c2);
        Ficha f3 = new Ficha(LocalDate.parse("18/06/2007",fmt), p3, c3);
        Ficha f4 = new Ficha(LocalDate.parse("01/09/2002",fmt), p4, c4);

        f1.imprime();
        System.out.println("");
        f2.imprime();
        System.out.println("");
        f3.imprime();
        System.out.println("");
        f4.imprime();

    }
}
