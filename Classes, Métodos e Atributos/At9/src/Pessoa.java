


import java.time.LocalDate;
import java.time.Period;


public class Pessoa {
    
    private String nome;
    private String apelido;
    private LocalDate dataNascimento;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public LocalDate  getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    

    
    
    public int getIdade() {
        LocalDate dataAtual = LocalDate.now();
        return Period.between(this.dataNascimento, dataAtual).getYears();
    }


}
