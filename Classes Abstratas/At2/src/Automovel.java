class Automovel extends Veiculo {
    private String renavam;
    private String placa;

    public Automovel(String renavam, String placa) {
        this.renavam = renavam;
        this.placa = placa;
    }

    @Override
    public void ligar() {
        System.out.println("O automóvel está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("O automóvel está desligado.");
    }

    @Override
    public void moverFrente() {
        System.out.println("O automóvel está se movendo para frente.");
    }

    @Override
    public void moverRe() {
        System.out.println("O automóvel está se movendo em ré.");
    }

    @Override
    public void parar() {
        System.out.println("O automóvel parou.");
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    

}
