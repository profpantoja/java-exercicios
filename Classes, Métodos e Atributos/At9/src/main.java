import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        
    
        
        Pessoa Marie = new Pessoa();

        Marie.setNome("Marie Frankie");
        Marie.setApelido("fank");
        Marie.setDataNascimento(LocalDate.of(1990, 8, 22));



        System.out.println("Nome: " + Marie.getNome());
        System.out.println("Apelido: " + Marie.getApelido());
        System.out.println("Data de Nascimento: " + Marie.getDataNascimento());
        
        // Calcular e exibir a idade
        System.out.println("Idade: " + Marie.getIdade() + " anos");
    }
}

