public class Aviao extends Veiculo {
    
    private String registroAeronautico;

    public Aviao() {
        super();
        setVoando(false);
    }

    public Aviao(String registroAeronautico) {
        super();
        this.registroAeronautico = registroAeronautico;
        setVoando(false);
    }

    public String getRegistroAeronautico() {
        return registroAeronautico;
    }

    public void setRegistroAeronautico(String registroAeronautico) {
        this.registroAeronautico = registroAeronautico;
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
        if(getLigado()){
            System.out.println("Indo para tras");
        }
        else {
            System.out.println("O veiculo está desligado!");
        }
    }

    @Override
    public void andarFrente() {
        if(getLigado()){
            System.out.println("Indo para frente");
        } 
        else {
            System.out.println("O veiculo está desligado!");
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

    public void decolar() {
        if(getVoando()) {
            System.out.println("O avião já está voando!");
        } 
        else {
            if(getLigado()){
                System.out.println("Aviao decolando!");
                setVoando(true);
            } 
            else {
                System.out.println("O veiculo está desligado!");
            }
        }
    }

    public void pousar() {
        if (!getVoando()) {
            System.out.println("O veículo já está aterrisado!");
        } 
        else {
            if(getLigado()) {
                System.out.println("Aterrisando!");
                setVoando(false);
            }
            else {
                System.out.println("O veiculo está desligado!");
            }
        }
    }

}
