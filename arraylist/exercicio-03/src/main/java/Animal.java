import java.util.ArrayList;

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

    public void procuraNome(ArrayList<String> nomesAnimais, String busca) {
        for(String nome : nomesAnimais){
            if(busca.equals(nome)) {
                System.out.println("Existe um animal chamado " + nome + " na CãoNino!");
                return;
            } 
        }
        System.out.println("Animal não encontrado.");
    }

    public void viraLatas(ArrayList<String> racaAnimais) {
        int i = 0;
        for(String raca : racaAnimais){
            if(raca.equals("Vira lata")) {
                i++;
            }
        }
        System.out.println("O numero de vira latas adotados é: " + i);
    }

}
