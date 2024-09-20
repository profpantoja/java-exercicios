class Automovel extends Veiculo {
    private String renavam;
    private String placa;

    public Automovel(String renavam, String placa) {
        this.renavam = renavam;
        this.placa = placa;
    }

    public void frear() {
        System.out.println("O automóvel está freando.");
    }

    public void passarMarcha() {
        System.out.println("O automóvel está passando marcha.");

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