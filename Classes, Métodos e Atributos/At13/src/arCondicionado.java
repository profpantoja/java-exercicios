
public class arCondicionado extends dispositivos{

    private int temperatura;

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public arCondicionado(boolean status, int temperatura) {
        super(status);
        this.temperatura = temperatura;
    }


    


    
}