package org.example;

public class Lion extends Animal {
    @Override
    public void respirar() {
        System.out.println("Lion está respirando.");
    }

    @Override
    public void dormir() {
        System.out.println("Lion está dormindo.");
    }

    @Override
    public void comer() {
        System.out.println("Lion está comendo.");
    }

    @Override
    public void andar() {
        System.out.println("Lion está andando.");
    }
}