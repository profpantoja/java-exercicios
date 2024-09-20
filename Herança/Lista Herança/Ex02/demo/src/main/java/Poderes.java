public class Poderes {
    private int dano; //tira vida do inimingo
    private String nome;

    public Poderes() {
    }

    public Poderes(int dano, String nome) {
        this.dano = dano;
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    
}
