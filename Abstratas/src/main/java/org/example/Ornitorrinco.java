package org.example;

public class Ornitorrinco extends Animal {
    @Override
    public void respirar() {
        System.out.println("Ornitorrinco está respirando.");
    }

    @Override
    public void dormir() {
        System.out.println("Ornitorrinco está dormindo.");
    }

    @Override
    public void comer() {
        System.out.println("Ornitorrinco está comendo.");
    }

    @Override
    public void andar() {
        System.out.println("Ornitorrinco está andando.");
    }
}