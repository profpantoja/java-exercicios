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

    public void viraLatas(ArrayList<String> racaAnimais) {
        int i = 0;
        for(String raca : racaAnimais){
            if(raca.equals("Vira lata")) {
                i++;
            }
        }
        System.out.println("O numero de vira latas é: " + i);
    }

    public void animaisAmarelos(ArrayList<String> corAnimais) {
        int i = 0;
        for(String cor : corAnimais){
            if(cor.equals("Amarela")){
                i++;
            }
        }
        System.out.println("Numero de cachorros amarelos: " + i);
    }

    public void nutricaoAnimal(ArrayList<Float> pesoAnimais) {
        int i = 0;
        for(Float peso : pesoAnimais) {
            if(peso < 21f){
                i++;
            }
        }
        System.err.println("O numero de cachorros desnutridos é: " + i);
    }

}
