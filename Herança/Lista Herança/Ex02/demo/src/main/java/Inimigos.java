public class Inimigos {
    private int energia;

    public Inimigos() {
    }

    public Inimigos(int energia) {
        this.energia = energia;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void aplicarDano(int dano) {
        energia -= dano;
    }
}
