package ex8;

public class Carro {
    
    private String marca;
    private String modelo;
    private int anoDeFabricacao;
    private int anoDoModelo;
    private String cor;
    private Double quilometragem;

    public void addQuilometragem(Double somaDeQuilometragem){
        quilometragem = quilometragem + somaDeQuilometragem;

    }
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
    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }
    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }
    public int getAnoDoModelo() {
        return anoDoModelo;
    }
    public void setAnoDoModelo(int anoDoModelo) {
        this.anoDoModelo = anoDoModelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Double getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(Double quilometragem) {
        this.quilometragem = quilometragem;
    }

    

}
