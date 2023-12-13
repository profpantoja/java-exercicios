public class Automovel extends Veiculo {

    private int numRenavan;
    private int placa;

    public Automovel() {

    }

    public Automovel(int numRenavan, int placa) {
        this.numRenavan = numRenavan;
        this.placa = placa;
    }

    // Métodos Getters e Setters

public getNumRenavan() {
    return numRenavan;
}

    public void setNumRenavan(int numRenavan) {
        this.numRenavan = numRenavan;
    }

public getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public void ligar() {
        System.out.println("Automóvel ligado");

    }

    public void desligar(){
        System.out.println("Automóvel desligado");
    }

    public void mover_frente(){
        System.out.println("Automóvel movendo para frente");

    }

    public void ré(){
        System.out.println("Automóvel dando ré");
    }

    public void parar(){
        System.out.println("Automóvel parado");
    }

}