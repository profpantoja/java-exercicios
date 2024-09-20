class Veiculo {
    private boolean ligado;

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public void moverFrente() {
        if (ligado) {
            System.out.println("O veículo está se movendo para frente.");
        } else {
            System.out.println("O veículo está desligado.");
        }
    }

    public void moverRe() {
        if (ligado) {
            System.out.println("O veículo está se movendo em ré.");
        } else {
            System.out.println("O veículo está desligado.");
        }
    }

    public void parar() {
        System.out.println("O veículo parou.");
    }
}