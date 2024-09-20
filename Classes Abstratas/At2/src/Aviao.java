class Aviao extends Veiculo {
    private String registroAeronautico;

    public Aviao(String registroAeronautico) {
        this.registroAeronautico = registroAeronautico;
    }

    @Override
    public void ligar() {
        System.out.println("O avião está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("O avião está desligado.");
    }

    @Override
    public void moverFrente() {
        System.out.println("O avião está movendo para a frente.");
    }

    @Override
    public void moverRe() {
        System.out.println("O avião está se movendo para trás.");
    }

    @Override
    public void parar() {
        System.out.println("O avião parou.");
    }

    public String getRegistroAeronautico() {
        return registroAeronautico;
    }

    public void setRegistroAeronautico(String registroAeronautico) {
        this.registroAeronautico = registroAeronautico;
    }


    

}
