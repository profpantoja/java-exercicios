class Dog extends Animal {
    @Override
    public void respirar() {
        System.out.println("O cachorro está respirando.");
    }

    @Override
    public void dormir() {
        System.out.println("O cachorro está dormindo.");
    }

    @Override
    public void comer() {
        System.out.println("O cachorro está comendo.");
    }

    @Override
    public void andar() {
        System.out.println("O cachorro está andando.");
    }

    public void latir() {
        System.out.println("O cachorro está latindo.");
    }
}
