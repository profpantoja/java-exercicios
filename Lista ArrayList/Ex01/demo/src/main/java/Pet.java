//Uma ONG chamada CãoNino, que cuida de cachorros abandonados, está precisando
//de um programa em Java para fazer o controle dos caninos que ela mantém em seu
//abrigo. Para isso ela precisa saber o nome, data de entrada no abrigo, se o animal
//possui raça, sua cor e peso para acompanhamento. Eventualmente, esses cachorros
//poderão ser adotados por almas caridosas. Contudo, a dona da ONG, deseja manter
//um cadastro das pessoas que adotam o animal. Dessa forma, para a pessoa é preciso
//saber seu nome, endereço, telefone, e-mail, sexo e, inclusive, qual o cão que está sendo
//adotado. Algumas informações sobre a adoção são mantidas em uma ficha de papel e
//também precisam ser informatizadas. As informações da ficha de adoção são: data de
//adoção, qual o cão foi adotado e quem adotou. Desenvolva o sistema acima criando
//suas respectivas classes e instancie os objetos de acordo com a tabela abaixo:

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
    
   
}
