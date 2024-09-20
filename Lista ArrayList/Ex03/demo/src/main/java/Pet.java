// Em seguida, no seu método main crie um ArrayList de adoções e verifique:
// a. Se existe algum cachorro dado um nome;
// b. Qual o cachorro com mais tempo de adotado;
// c. Quantos cachorros da raça Vira Lata foram adotados.

import java.time.LocalDate;

public class Pet {
   private String nome; 
   private LocalDate dataEntrada; 
   private String raca; 
   private String cor; 
   private double peso;
   private String especie;

    public Pet(String nome, LocalDate dataEntrada, String raca, String cor, double peso, String especie) {
    this.nome = nome;
    this.dataEntrada = dataEntrada;
    this.raca = raca;
    this.cor = cor;
    this.peso = peso;
    this.especie = especie;
}

    public Pet() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public boolean temRaca(){
        if(!raca.equals("Vira Lata")){
            return true;
        }
        else{
            return false;
        }
   }
   
   public void nutrido(){
        if(peso > 0 && peso <=20){
            System.out.println("Estado do Pet: Desnutrido!");
        }
        else if(peso >20 && peso <=30){
            System.out.println("Estado do Pet: Normal");
        }
        else{
            System.out.println("Estado do Pet: Obeso"); 
        }
   }

}
