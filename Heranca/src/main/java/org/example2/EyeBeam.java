package org.example2;

public class EyeBeam implements Poder {
    @Override
    public void usar(Personagem alvo) {
        System.out.println("EyeBeam usado em " + alvo.getClass().getSimpleName());
        alvo.reduzirEnergia(12);
    }
}