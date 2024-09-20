class Eagle extends Animal {
    @Override
    public void respirar() {
        System.out.println("A águia está respirando.");
    }

    @Override
    public void dormir() {
        System.out.println("A águia está dormindo.");
    }

    @Override
    public void comer() {
        System.out.println("A águia está comendo.");
    }

    @Override
    public void andar() {
        System.out.println("A águia está andando.");
    }

    public void voar() {
        System.out.println("A águia está voando.");
    }
}
