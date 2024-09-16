package Model;

public class Character {

    private String nome;
    private String tipo_animal;
    private String cor;
    private float altura;
    private float largura;
    private int x;
    private int y;
    private int qtd_vidas;
    private int qtd_moedas;

    public Character() {
    }

    public Character(String nome, String tipo_animal, String cor, float altura, float largura, int x, int y,
            int qtd_vidas, int qtd_moedas) {
        this.nome = nome;
        this.tipo_animal = tipo_animal;
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.x = x;
        this.y = y;
        this.qtd_vidas = qtd_vidas;
        this.qtd_moedas = qtd_moedas;
    }

    public void mover(String movimento, Character character){
    int calc;
        
        switch(movimento){
            case "frente":
                calc = character.getX() + 1;
                character.setX(calc);
                System.out.println("O "+character.getNome()+" se moveu para frente, sua nova posiçao é: ("+character.getX()+","+character.getY()+")");
                break;
            case "tras":
                if(character.getX() != 0) {
                    calc = character.getX() - 1;
                    character.setX(calc);
                    System.out.println("O "+character.getNome()+" se moveu para trás, sua nova posiçao é: ("+character.getX()+","+character.getY()+")");
                    break;
                }
                else{
                    System.out.println("Nao é possível movimentar o "+character.getNome()+ "para trás, sua posiçao é: ("+character.getX()+","+character.getY()+")");
                    break;
                }
                
            case "baixo":
                if(character.getY() != 0) {
                    calc = character.getY() - 1;
                    character.setY(calc);
                    System.out.println("O "+character.getNome()+" se moveu para baixo, sua nova posiçao é: ("+character.getX()+","+character.getY()+")");
                    break;
                }
                else{
                    System.out.println("Nao é possível movimentar o "+character.getNome()+ " para baixo, sua posiçao é: ("+character.getX()+","+character.getY()+")");
                    break;
                }
            case "cima":
                calc = character.getY() + 1;
                character.setY(calc);
                System.out.println("O "+character.getNome()+" se moveu para cima, sua nova posiçao é: ("+character.getX()+","+character.getY()+")");
                break;
            default:
                System.out.println("Movimento nao reconhecido!");
                break;
        }

    }

    public Character(String nome, String tipo_animal, String cor, float altura, float largura, int x, int y,int qtd_vidas) {
        this.nome = nome;
        this.tipo_animal = tipo_animal;
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.x = x;
        this.y = y;
        this.qtd_vidas = qtd_vidas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo_animal() {
        return tipo_animal;
    }
    public void setTipo_animal(String tipo_animal) {
        this.tipo_animal = tipo_animal;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getQtd_vidas() {
        return qtd_vidas;
    }
    public void setQtd_vidas(int qtd_vidas) {
        this.qtd_vidas = qtd_vidas;
    }
    public int getQtd_moedas() {
        return qtd_moedas;
    }
    public void setQtd_moedas(int qtd_moedas) {
        this.qtd_moedas = qtd_moedas;
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
