import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando cachorros
        Cachorro kate = new Cachorro("Kate", LocalDate.of(2009, 6, 12), "Vira Lata", "Preta", 35);
        Cachorro bob = new Cachorro("Bob", LocalDate.of(2010, 10, 9), "Bulldog", "Preta", 22);
        Cachorro pitty = new Cachorro("Pitty", LocalDate.of(2007, 3, 2), "Pitbull", "Branca", 38);
        Cachorro kelly = new Cachorro("Kelly", LocalDate.of(2001, 5, 8), "Labrador", "Amarela", 36);
        Cachorro peixe = new Cachorro("Peixe", LocalDate.of(2008, 11, 9), "Vira Lata", "Amarela", 20);
        Cachorro grazi = new Cachorro("Grazi", LocalDate.of(2012, 12, 12), "Pastor", "Amarela", 18);

        // Criando pessoas
        Pessoa diana = new Pessoa("Diana", "Rua A", "123456789", "diana@example.com", "Feminino");
        Pessoa louis = new Pessoa("Louis", "Rua B", "987654321", "louis@example.com", "Masculino");
        Pessoa bruce = new Pessoa("Bruce", "Rua C", "111222333", "bruce@example.com", "Masculino");
        Pessoa clark = new Pessoa("Clark", "Rua D", "444555666", "clark@example.com", "Masculino");

        // Criando adoções
        Adocao adocao1 = new Adocao(kate, diana, LocalDate.of(2010, 12, 24));
        Adocao adocao2 = new Adocao(bob, louis, LocalDate.of(2011, 3, 20));
        Adocao adocao3 = new Adocao(pitty, bruce, LocalDate.of(2007, 6, 18));
        Adocao adocao4 = new Adocao(kelly, clark, LocalDate.of(2002, 9, 1));

        List<Adocao> adocoes = new ArrayList<>();
        adocoes.add(adocao1);
        adocoes.add(adocao2);
        adocoes.add(adocao3);
        adocoes.add(adocao4);

        //  Verificar se existe algum cachorro com um nome específico
        String nomeProcurado = "Kate";
        boolean cachorroEncontrado = false;
        for (Adocao adocao : adocoes) {
            if (adocao.getCachorro().getNome().equals(nomeProcurado)) {
                cachorroEncontrado = true;
                break;
            }
        }
        System.out.println("Cachorro com nome '" + nomeProcurado + "' encontrado: " + cachorroEncontrado);

        //Qual o cachorro com mais tempo de adotado
        Adocao maisTempoAdotado = adocoes.get(0);
        for (Adocao adocao : adocoes) {
            if (adocao.getDataAdocao().isBefore(maisTempoAdotado.getDataAdocao())) {
                maisTempoAdotado = adocao;
            }
        }
        System.out.println("Cachorro com mais tempo de adoção: " + maisTempoAdotado.getCachorro().getNome());

        // Quantos cachorros da raça Vira Lata foram adotados
        int viraLatasAdotados = 0;
        for (Adocao adocao : adocoes) {
            if (adocao.getCachorro().getRaca().equals("Vira Lata")) {
                viraLatasAdotados++;
            }
        }
        System.out.println("Cachorros Vira Lata adotados: " + viraLatasAdotados);

        // lista de cachorros
        List<Cachorro> cachorros = new ArrayList<>();
        cachorros.add(kate);
        cachorros.add(bob);
        cachorros.add(pitty);
        cachorros.add(kelly);
        cachorros.add(peixe);
        cachorros.add(grazi);

        // Quantos cachorros estão desnutridos (peso <= 20kg)
        int desnutridos = 0;
        for (Cachorro cachorro : cachorros) {
            if (cachorro.getPeso() <= 20) {
                desnutridos++;
            }
        }
        System.out.println("Cachorros desnutridos: " + desnutridos);

        //Quantos cachorros são Vira Latas
        int viraLatas = 0;
        for (Cachorro cachorro : cachorros) {
            if (cachorro.getRaca().equals("Vira Lata")) {
                viraLatas++;
            }
        }
        System.out.println("Cachorros Vira Latas: " + viraLatas);

        // Quantos cachorros são da cor amarela
        int corAmarela = 0;
        for (Cachorro cachorro : cachorros) {
            if (cachorro.getCor().equals("Amarela")) {
                corAmarela++;
            }
        }
        System.out.println("Cachorros da cor amarela: " + corAmarela);
    }
}
