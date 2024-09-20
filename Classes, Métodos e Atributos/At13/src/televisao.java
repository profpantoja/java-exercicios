

public class televisao extends dispositivos{
    
    private int canais;
    private String source;

    
    public int getCanais() {
        return canais;
    }
    public void setCanais(int canais) {
        this.canais = canais;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }

    
    public televisao(boolean status, int canais, String source) {
        super(status);
        this.canais = canais;
        this.source = source;
    }
        

}