import java.util.ArrayList;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<FichaAdocao> fichas = new ArrayList<>();
        ArrayList<Pet> pets = new ArrayList<>();
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int countViraLatasAdotados = 0;
        int countViraLatas = 0;
        int qntDesnutridos = 0;
        int qntAmarelos = 0;
        String nomePetCheck = new String();
        boolean hasPet = false;

        pets.add(new Pet("Kate", "Vira-Lata", "Cachorro", LocalDate.of(2009, 6, 12), "Preta", 35));
        pets.add(new Pet("Bob", "Bulldog", "Cachorro", LocalDate.of(2010, 10, 9), "Preta", 22));
        pets.add(new Pet("Pitty", "Pitbull", "Cachorro", LocalDate.of(2007, 3, 2), "Branca", 38));
        pets.add(new Pet("Kelly", "Labrador", "Cachorro", LocalDate.of(2001, 5, 8), "Amarela", 36));
        pets.add(new Pet("Peixe", "Vira-Lata", "Cachorro", LocalDate.of(2008, 11, 9), "Amarela", 20));
        pets.add(new Pet("Grazi", "Pastor", "Cachorro", LocalDate.of(2012, 12, 12), "Amarela", 18));

        pessoas.add(new Pessoa("Diana", "12345678901", new Endereco("00000000", "Mario Perdigão", "Cordovil", "RJ", 120), new Contato("021999999999", "diana@gmail.com"), 'F'));
        pessoas.add(new Pessoa("Louis", "23456789012", new Endereco("00000000", "Princesa Isabel", "Copacabana", "RJ", 1201), new Contato("021999999999", "louis@gmail.com"), 'M'));
        pessoas.add(new Pessoa("Bruce", "34567890123", new Endereco("00000000", "Meu Mengão", "Aterro do Flamengo", "RJ", 1112), new Contato("021999999999", "bruce@hotmail.com"), 'M'));
        pessoas.add(new Pessoa("Clark", "45678901234", new Endereco("00000000", "Rua 2", "Cidade de Deus", "RJ", 2), new Contato("021999999999", "clark@yahoo.com"), 'M'));

        fichas.add(new FichaAdocao(pets.get(0), pessoas.get(0), LocalDate.of(2010, 12, 24)));
        fichas.add(new FichaAdocao(pets.get(1), pessoas.get(1), LocalDate.of(2011, 3, 20)));
        fichas.add(new FichaAdocao(pets.get(2), pessoas.get(2), LocalDate.of(2007, 6, 18)));
        fichas.add(new FichaAdocao(pets.get(3), pessoas.get(3), LocalDate.of(2002, 9, 1)));
        fichas.add(new FichaAdocao(pets.get(4), pessoas.get(1), LocalDate.of(2000, 1, 1)));

        //inicio parte 3 do exercicio
        
        nomePetCheck = "Bob";

        ArrayList<FichaAdocao> remover = new ArrayList<>();
        for(int i = 0; i < fichas.size(); i++)
            if(fichas.get(i).getPet() == null) remover.add(fichas.get(i));

        fichas.removeAll(remover);

        FichaAdocao maisTempoAdotado = fichas.get(0);

        for(int i = 0; i < fichas.size(); i++){
            if(fichas.get(i).contains(nomePetCheck)) hasPet = true;
            if(fichas.get(i).getPet().getRace() == "Vira-Lata") countViraLatasAdotados++;
            if(fichas.get(i).tempoAdotado() > maisTempoAdotado.tempoAdotado()) maisTempoAdotado = fichas.get(i);
        }

        

        System.out.println("#3 -----------------------");
        System.out.println("Sistema tem o pet " + nomePetCheck + "? " + hasPet);
        System.out.println("Quantidade de Vira-Latas adotados: " + countViraLatasAdotados);
        System.out.println("Pet com mais tempo de adoção: " + maisTempoAdotado.getPet().getName());

        //fim parte 3 do exercicio
        //inicio parte 4

        for(int i = 0; i < pets.size(); i++){
            if(pets.get(i).getColor().equals("Amarela")) qntAmarelos++;
            if(pets.get(i).getRace().equals("Vira-Lata")) countViraLatas++;
            if(pets.get(i).getNutricao().equals("Desnutrido")) qntDesnutridos++;
        }

        System.out.println("#4 -----------------------");
        System.out.println("Quantidade de Pets desnutridos: " + qntDesnutridos);
        System.out.println("Quantidade de Vira-Latas admissionados: " + countViraLatas);
        System.out.println("Quantidade de pets amarelos: " + qntAmarelos);


    }
    
}
