class Barco extends Veiculo {
    private String registroEmbarcacao;

    public Barco(String registroEmbarcacao) {
        this.registroEmbarcacao = registroEmbarcacao;
    }

    @Override
    public void ligar() {
        System.out.println("O barco está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("O barco está desligado.");
    }

    @Override
    public void moverFrente() {
        System.out.println("O barco está navegando para a frente.");
    }

    @Override
    public void moverRe() {
        System.out.println("O barco está navegando para trás.");
    }

    @Override
    public void parar() {
        System.out.println("O barco parou.");
    }

    public String getRegistroEmbarcacao() {
        return registroEmbarcacao;
    }

    public void setRegistroEmbarcacao(String registroEmbarcacao) {
        this.registroEmbarcacao = registroEmbarcacao;
    }

      

}
