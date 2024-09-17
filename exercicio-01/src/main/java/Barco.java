public class Barco extends Veiculo {
    
    private String registroEmbarcacao;

    public Barco() {
        super();
        setAncorado(false);
    }

    public Barco(String registroEmbarcacao) {
        super();
        this.registroEmbarcacao = registroEmbarcacao;
        setAncorado(false);
    }

    public String getRegistroEmbarcacao() {
        return registroEmbarcacao;
    }

    public void setRegistroEmbarcacao(String registroEmbarcacao) {
        this.registroEmbarcacao = registroEmbarcacao;
    }

    @Override
    public void ligar() {
            System.out.println("Ligado!");
            setLigado(true);
    }

    @Override
    public void desligar() {
            System.out.println("Desligado!");
            setLigado(false);
    }

    @Override
    public void darRe() {
        if(getAncorado()) {
            System.out.println("O veiculo esta ancorado!");
        } else {
            if(getLigado()){
                System.out.println("Indo para tras");
            }
            else {
                System.out.println("O veiculo está desligado!");
            }
        }
    }

    @Override
    public void andarFrente() {
        if(getAncorado()) {
            System.out.println("O veiculo esta ancorado!");
        } else {
            if(getLigado()){
                System.out.println("Indo para frente");
            } 
            else {
                System.out.println("O veiculo está desligado!");
            }
        }
    }

    @Override
    public void parar() {
        if(getLigado()){
            System.out.println("Parado");
        }
        else {
            System.out.println("O veiculo está desligado!");
        }
    }

    public void navegar() {
        if(getAncorado()) {
            System.out.println("O veiculo esta ancorado!");
        } else {
            if(getLigado()){
                System.out.println("Navegando!");
            } 
            else {
                System.out.println("O veiculo está desligado!");
            }
        }
    }

    public void ancorar() {
        if (getLigado()) {
            System.out.println("Ancorado!");
            setAncorado(true);
        }
        else {
            System.out.println("O veiculo está desligado!");
        }
    }

}
