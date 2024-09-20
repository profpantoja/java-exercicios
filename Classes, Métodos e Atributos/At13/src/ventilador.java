public class ventilador extends dispositivos{
    


    private int velocidade;
    String[] vent = new String [3];



    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String[] getVent() {
        return vent;
    }

    public void setVent(String[] vent) {
        this.vent = vent;
    }

    public ventilador(boolean status, int velocidade, String[] vent) {
        super(status);
        this.velocidade = velocidade;
        this.vent = vent;
    }

    

    
        
        
}
