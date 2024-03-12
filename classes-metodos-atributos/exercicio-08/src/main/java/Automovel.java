package main.Java;

public class Automovel {
    
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int anoModelo;
    private String cor;
    private int Kilometragem = 0; 

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }
    
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public int getKilometragem() {
        return Kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        Kilometragem = kilometragem;
    }

    public void AddKm(int Km) {
        Kilometragem += Km;
        System.out.println(Kilometragem);
    }

    public void VelocidadeMedia(float tempo, float distancia) {
        float VM = distancia / tempo;
        System.out.println("A velocidade media eh: " + VM);
    }

    public void Acelerar() {
        System.out.println("Carro acelerando!");
    }

    public void Frear() {
        System.out.println("Carro freando!");
    }

    public void EsquerdaDireita(String escolha) {
        if(escolha.equalsIgnoreCase("esquerda")) {
            System.out.println("Virando para a esquerda");
        } else if(escolha.equalsIgnoreCase("direita")) {
            System.out.println("Virando a direita!");
        }
    }

}
