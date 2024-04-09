public class Automovel extends Veiculo {
    
    private String renavam;
    private String placa;

    public Automovel() {
        super();
    }

    public Automovel(String renavam, String placa) {
        super();
        this.renavam = renavam;
        this.placa = placa;
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
            setParado(false);
        }
        else {
            System.out.println("O veiculo está desligado!");
        }
    }

    @Override
    public void andarFrente() {
        if(getLigado()){
            System.out.println("Indo para frente");
            setParado(false);
        } 
        else {
            System.out.println("O veiculo está desligado!");
        }
    }

    @Override
    public void parar() {
        if(getLigado()){
            System.out.println("Parado");
            setParado(true);
        }
        else {
            System.out.println("O veiculo está desligado!");
        }
    }

    public void frear() {
        if(getLigado()){
            System.out.println("Parando");
            setParado(true);
        } 
        else {
            System.out.println("O veiculo está desligado!");
        }
    }

    public void passarMarcha() {
        if(getParado()) {
            System.out.println("O veículo está parado!");
        } 
        else {
            if(getLigado()) {
                System.out.println("Trocando marcha!");
            }
            else {
                System.out.println("O veiculo está desligado!");
            }
        }
    }
}