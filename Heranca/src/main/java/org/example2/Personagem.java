package org.example2;

public abstract class Personagem {
    protected int energia;

    public Personagem(int energia) {
        this.energia = energia;
    }

    public void reduzirEnergia(int quantidade) {
        energia -= quantidade;
        if (energia <= 0) {
            morrer();
        }
    }

    public abstract void morrer();
}