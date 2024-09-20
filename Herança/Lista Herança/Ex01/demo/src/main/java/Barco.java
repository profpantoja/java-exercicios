public class Barco extends Veiculo {
    private String registroEmbarcacao;

    boolean isAncorado = false;
    public Barco() {
    }

    public Barco(String registroEmbarcacao) {
        this.registroEmbarcacao = registroEmbarcacao;
    }

    public String getRegistroEmbarcacao() {
        return registroEmbarcacao;
    }

    public void setRegistroEmbarcacao(String registroEmbarcacao) {
        this.registroEmbarcacao = registroEmbarcacao;
    }

    public void ancorar(){
        if(ligado == true && isAncorado == false){
            System.out.println("O barco ancorou!");
            isAncorado = true;
        }
        else{
            System.out.println("O barco esta desligado ou ja esta ancorado!");
        }
    }

    public void navegar(){
        if(ligado == true && isAncorado == false){
            System.out.println("O barco esta navegando!");
        }
        else{
            System.out.println("O barco esta desligado ou ancorado, portanto, nao pode navegar!");
        }
    }
}
