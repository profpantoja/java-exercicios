package org.example;

public class Dog extends Animal {
    @Override
    public void respirar() {
        System.out.println("Dog está respirando.");
    }

    @Override
    public void dormir() {
        System.out.println("Dog está dormindo.");
    }

    @Override
    public void comer() {
        System.out.println("Dog está comendo.");
    }

    @Override
    public void andar() {
        System.out.println("Dog está andando.");
    }

    public void latir() {
        System.out.println("Dog está latindo.");
    }
}