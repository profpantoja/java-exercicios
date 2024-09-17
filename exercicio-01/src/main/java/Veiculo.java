public class Veiculo {
    
    private Boolean ligado;
    private Boolean parado;
    private Boolean ancorado;
    private Boolean voando;
    private Boolean aterrisado;

    public Veiculo() {

    }

    public Veiculo(Boolean ligado, Boolean parado, Boolean ancorado, Boolean voando, Boolean aterrisado) {
        this.ligado = ligado;
        this.parado = parado;
        this.ancorado = ancorado;
        this.voando = voando;
        this.aterrisado = aterrisado;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public Boolean getParado() {
        return parado;
    }

    public void setParado(Boolean parado) {
        this.parado = parado;
    }

    public Boolean getAncorado() {
        return ancorado;
    }

    public void setAncorado(Boolean ancorado) {
        this.ancorado = ancorado;
    }

    public Boolean getVoando() {
        return voando;
    }

    public void setVoando(Boolean voando) {
        this.voando = voando;
    }

    public Boolean getAterrisado() {
        return aterrisado;
    }

    public void setAterrisado(Boolean aterrisado) {
        this.aterrisado = aterrisado;
    }

    public void ligar() {
            System.out.println("Ligado!");
            setLigado(true);
    }

    public void desligar() {
            System.out.println("Desligado!");
            setLigado(false);
    }

    public void darRe() {
        if(getLigado()){
            System.out.println("Indo para tras");
        }
        else {
            System.out.println("O veiculo está desligado!");
        }
    }

    public void andarFrente() {
        if(getLigado()){
            System.out.println("Indo para frente");
        } 
        else {
            System.out.println("O veiculo está desligado!");
        }
    }

    public void parar() {
        if(getLigado()){
            System.out.println("Parado");
        }
        else {
            System.out.println("O veiculo está desligado!");
        }
    }
    
}
