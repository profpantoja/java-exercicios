package org.example;

public class Eagle extends Animal {
    @Override
    public void respirar() {
        System.out.println("Eagle está respirando.");
    }

    @Override
    public void dormir() {
        System.out.println("Eagle está dormindo.");
    }

    @Override
    public void comer() {
        System.out.println("Eagle está comendo.");
    }

    @Override
    public void andar() {
        System.out.println("Eagle está andando.");
    }

    public void voar() {
        System.out.println("Eagle está voando.");
    }
}