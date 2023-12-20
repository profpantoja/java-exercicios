package main.java;

public class Barco extends Veiculo {

    private int registroEmbarcacao;

    public Barco(){

    }

    public Barco (int registroEmbarcacao){
        this.registroEmbarcacao = registroEmbarcacao;
    }

    // Métodos Getters e Setters

    
    public int getRegitroEmbarcacao(){
        return registroEmbarcacao;
    }

    public void setRegistroEmbarcacao(int registroEmbarcacao) {
        this.registroEmbarcacao = registroEmbarcacao;


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