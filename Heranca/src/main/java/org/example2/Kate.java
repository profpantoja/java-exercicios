package org.example2;

import java.util.ArrayList;
import java.util.List;

public class Kate extends Personagem {
    private int vidas;
    private List<Poder> poderes;
    private Poder poderAtual;

    public Kate(int energia, int vidas) {
        super(energia);
        this.vidas = vidas;
        this.poderes = new ArrayList<>();
    }

    public void adicionarPoder(Poder poder) {
        if (poderes.size() < 4) {
            poderes.add(poder);
        } else {
            System.out.println("Kate já possui 4 poderes.");
        }
    }

    public void trocarPoder(int indice) {
        if (indice >= 0 && indice < poderes.size()) {
            poderAtual = poderes.get(indice);
            System.out.println("Poder trocado para: " + poderAtual.getClass().getSimpleName());
        } else {
            System.out.println("Índice de poder inválido.");
        }
    }

    public void listarPoderes() {
        for (int i = 0; i < poderes.size(); i++) {
            System.out.println(i + ": " + poderes.get(i).getClass().getSimpleName());
        }
    }

    public void usarPoder(Personagem alvo) {
        if (poderAtual != null) {
            poderAtual.usar(alvo);
        } else {
            System.out.println("Nenhum poder selecionado.");
        }
    }

    @Override
    public void morrer() {
        vidas--;
        if (vidas <= 0) {
            System.out.println("Kate morreu.");
        } else {
            System.out.println("Kate perdeu uma vida. Vidas restantes: " + vidas);
        }
    }
}