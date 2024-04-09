public class Automovel {
    
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int anoModelo;
    private String cor;
    private double quilometragem;
    private double velocidadeMedia;

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

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public void adicionarKm(int km) {
        quilometragem += km;
    }

    public void gerarVelocidadeMedia(double distanciaPercorrida, double tempo) {
        velocidadeMedia = distanciaPercorrida / tempo;
    }

    public void acelerar() {
        System.out.println("Automóvel está acelerando.");
    }

    public void frear() {
        System.out.println("Automóvel está freando.");
    }

    public void mover(String direcao) {
        if (direcao.equalsIgnoreCase("direita")) {
            System.out.println("Automóvel movido para a direita.");
        } else if (direcao.equalsIgnoreCase("esquerda")) {
            System.out.println("Automóvel movido para a esquerda.");
        } else {
            System.out.println("Direção inválida.");
        }
    }
}
