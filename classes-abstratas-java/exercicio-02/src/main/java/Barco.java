package main.java;

public class Barco extends Veiculo {

    private int registroembarcacao;

    public Barco(){

    }

    public Barco (int registroembarcacao){
        this.registroembarcacao = registroembarcacao;
    }

    // Métodos Getters e Setters

    
    public int getRegitroembarcacao(){
        return registroembarcacao;
    }

    public void setRegistroembarcacao(int registroembarcacao) {
        this.registroembarcacao = registroembarcacao;


}

public void ligado(){
    
}

public void desligar(){
   
}

public void mover_frente(){
    System.out.println("Barco movendo");

}

public void ré(){
    
}

public void parar(){
    System.out.println("Barco parado");
}

}