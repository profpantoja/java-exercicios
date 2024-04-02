import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ficha {
    
    private String data;
    private Pessoa pessoa;
    private Animal animal;
    
    public Ficha() {
        
    }

    public Ficha(String data, Pessoa pessoa, Animal animal) {
        this.data = data;
        this.pessoa = pessoa;
        this.animal = animal;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public static void comparandoDatas(ArrayList<String> tempoAdocao) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate primeiro = LocalDate.parse(tempoAdocao.get(0), formato);

        for(String data : tempoAdocao) {
            LocalDate atualmente = LocalDate.parse(data, formato);
            if(atualmente.isBefore(primeiro)){
                primeiro = atualmente;
            }
        }
        System.out.println("O cachorro com mais tempo foi adotado em: " + primeiro.format(formato));
    }

}
