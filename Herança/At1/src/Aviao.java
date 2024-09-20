class Aviao extends Veiculo {
    private String registroAeronautico;

    public Aviao(String registroAeronautico) {
        this.registroAeronautico = registroAeronautico;
    }

    public void decolar() {
        System.out.println("O avião está decolando.");
    }

    public void pousar() {
        System.out.println("O avião está pousando.");
    }

    public String getRegistroAeronautico() {
        return registroAeronautico;
    }

    public void setRegistroAeronautico(String registroAeronautico) {
        this.registroAeronautico = registroAeronautico;
    }


    

}
