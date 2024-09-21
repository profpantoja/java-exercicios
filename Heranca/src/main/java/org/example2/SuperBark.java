package org.example2;

public class SuperBark implements Poder {
    @Override
    public void usar(Personagem alvo) {
        System.out.println("SuperBark usado em " + alvo.getClass().getSimpleName());
        alvo.reduzirEnergia(10);
    }
}