import java.time.LocalDate;

public class Cachorro {
    private String nome;
    private LocalDate dataEntrada;
    private String raca;
    private String cor;
    private double peso;

    public Cachorro(String nome, LocalDate dataEntrada, String raca, String cor, double peso) {
        this.nome = nome;
        this.dataEntrada = dataEntrada;
        this.raca = raca;
        this.cor = cor;
        this.peso = peso;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public String getRaca() {
        return raca;
    }

    public String getCor() {
        return cor;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome;
    }


    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }



    

    
}
