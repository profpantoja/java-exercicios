package org.example2;

public abstract class Inimigo extends Personagem {
    public Inimigo(int energia) {
        super(energia);
    }

    @Override
    public void morrer() {
        System.out.println(this.getClass().getSimpleName() + " morreu.");
    }
}