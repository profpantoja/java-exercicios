package ex13;

public class Ventilador {
    private String status;
    private int velocidade;
    

    public Ventilador(){
        this.velocidade = 0;
        this.status = "Off";
    }


    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void alterarVelocidade(int novaVelocidade) {
        if(novaVelocidade > 3 || novaVelocidade == 0){
            System.out.println("O ventilador possui apenas 3 velocidades [1, 2 e 3].");

        }else{
            this.velocidade = novaVelocidade;
            this.status = "On";
        }
        
    }


   

}
