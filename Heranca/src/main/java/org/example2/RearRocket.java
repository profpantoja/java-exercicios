package org.example2;

public class RearRocket implements Poder {
    @Override
    public void usar(Personagem alvo) {
        System.out.println("RearRocket usado em " + alvo.getClass().getSimpleName());
        alvo.reduzirEnergia(18);
    }
}