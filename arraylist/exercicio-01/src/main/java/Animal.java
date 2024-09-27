public class Animal {
    
    private String nome;
    private String chegada;
    private String raca;
    private String cor; 
    private float peso;

    public Animal() {

    }

    public Animal(String nome, String chegada, String raca, String cor, float peso) {
        this.nome = nome;
        this.chegada = chegada;
        this.raca = raca;
        this.cor = cor;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getChegada() {
        return chegada;
    }

    public void setChegada(String chegada) {
        this.chegada = chegada;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

}
