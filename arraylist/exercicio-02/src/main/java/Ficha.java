import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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

    public void tempoAdotado() {
        LocalDate atual = LocalDate.now();
        LocalDate adocao = LocalDate.parse(this.data);

        long anos = ChronoUnit.YEARS.between(adocao, atual);

        System.out.println("O cachorro foi adotado há " + anos + " anos");
    }

    public void alterarDono (Pessoa novoDono) {
        System.out.println("Antigo dono: " + this.pessoa.getNome() + " || Gênero: " + this.pessoa.getSexo());
        this.pessoa = novoDono;
        System.out.println("Novo dono: " + this.pessoa.getNome() + " || Gênero: " + this.pessoa.getSexo());
    }

    public int verificacaoData () {
        LocalDate adocao = LocalDate.parse(this.getData());
        LocalDate chegada = LocalDate.parse(this.getAnimal().getChegada());
        
        if(adocao.isBefore(chegada)) {
            System.out.println("Erro nas datas.");
            return (Integer) null;
        }

        return 0;
    }

}
