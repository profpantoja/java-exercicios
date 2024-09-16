package Model;

public class ObjectGame {

    private String nome;
    private String material;
    private float altura;
    private float largura;
    private int x;
    private int y;
    
    public ObjectGame() {
    }

    public ObjectGame(String nome, String material, float altura, float largura, int x, int y) {
        this.nome = nome;
        this.material = material;
        this.altura = altura;
        this.largura = largura;
        this.x = x;
        this.y = y;
    }

    public ObjectGame(String nome, String material) {
        this.nome = nome;
        this.material = material;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getLargura() {
        return largura;
    }
    public void setLargura(float largura) {
        this.largura = largura;
    }
    
    
}
