public class Automovel extends Veiculo {
    private String renevam;
    private String placa;

    public Automovel() {
    }

    public Automovel(String renevam, String placa) {
        this.renevam = renevam;
        this.placa = placa;
    }

    public String getRenevam() {
        return renevam;
    }

    public void setRenevam(String renevam) {
        this.renevam = renevam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void frear(){
        if(ligado == true){
            System.out.println("O automovel freou!");
        }
        else{
            System.out.println("O automovel nao esta ligado, portanto, nao pode frear!");
        }
       
    }

    public void passarMarcha(){
        if(ligado == true && isParado == false){
            System.out.println("O automovel trocou de marcha!");
        }
        else{
            System.out.println("O automovel nao esta ligado ou esta parado, portanto, nao pode trocar de marcha!");
        }
        
    }
}
