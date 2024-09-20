import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Coordenador coordenador = new Coordenador("Dr. Silva", "dr.silva@universidade.com", "Universidade ABC", "Rua X, 123", "Professor");
        Pesquisa pesquisa = new Pesquisa("Pesquisa em IA", "Inteligência Artificial em saúde", LocalDate.now(), LocalDate.of(2025, 12, 31), "Informática", coordenador);
        pesquisa.imprimirInformacoes();

        Livro livro = new Livro("Java Avançado", 2022, new String[]{"Autor A", "Autor B"}, "Editora XPTO", "São Paulo");
        livro.imprimirInformacoes();
    }
}
