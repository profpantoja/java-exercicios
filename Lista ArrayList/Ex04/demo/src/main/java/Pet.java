// Faça o mesmo para todos os objetos cachorros e verifique:
// a. Quantos cachorros estão desnutridos;
// b. Quantos cachorros são vira latas;
// c. Quantos cachorros são da cor Amarela.

import java.time.LocalDate;

public class Pet {
    private String nome;
    private String cor;
    private double peso;
    private Raca raca;
    private LocalDate dataEntrada;
    private Especie especie;

    public Pet() {
    }

    public Pet(String nome, String cor, double peso, Raca raca, LocalDate dataEntrada, Especie especie) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
        this.raca = raca;
        this.dataEntrada = dataEntrada;
        this.especie = especie;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public boolean temRaca(){
        if(raca.equals(Raca.Vira_Lata)){
            return false;
        }
        else{
            return true;
        }
    }

    public void nutrido(){
        if(peso > 0 && peso <=20){
            System.out.println("Estado do Pet: Desnutrido");
        }
        else if(peso <=30){
            System.out.println("Estado do Pet: Peso normal");
        }
        else{
            System.out.println("Estado do Pet: Obeso");
        }
    }
}