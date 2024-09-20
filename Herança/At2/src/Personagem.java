class Personagem {
    protected int energia;

    public Personagem() {
        this.energia = 100;
    }

    public void reduzirEnergia(int valor) {
        energia -= valor;
        if (energia <= 0) {
            System.out.println("Personagem morreu.");
        }
    }

    public int getEnergia() {
        return energia;
    }


    public void receberDano(Poder poder) {
        int dano = poder.getDano();
        this.reduzirEnergia(dano);
        System.out.println("Personagem recebeu dano de: " + poder.getNome() + ". Energia restante: " + this.getEnergia());
    }
    

    
}