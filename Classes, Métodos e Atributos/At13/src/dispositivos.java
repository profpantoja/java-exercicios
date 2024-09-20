

public class dispositivos {
    
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public dispositivos(boolean status) {
        this.status = status;
    }

    public void ligar(){
        setStatus(true);
    }
    public void desligar(){
        setStatus(false);
    }
     
    
}
