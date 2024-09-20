class Barco extends Veiculo {
    private String registroEmbarcacao;

    public Barco(String registroEmbarcacao) {
        this.registroEmbarcacao = registroEmbarcacao;
    }

    public void navegar() {
        System.out.println("O barco está navegando.");
    }

    public void ancorar() {
        System.out.println("O barco está ancorado.");
    }

    public String getRegistroEmbarcacao() {
        return registroEmbarcacao;
    }

    public void setRegistroEmbarcacao(String registroEmbarcacao) {
        this.registroEmbarcacao = registroEmbarcacao;
    }

    

}