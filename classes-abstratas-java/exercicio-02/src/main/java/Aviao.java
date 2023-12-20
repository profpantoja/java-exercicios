package main.java;

public class Aviao extends Veiculo {

    private int registroaeronautico;

    public Aviao(){

    }

    public Aviao (int registroaeronautico){
        this.registroaeronautico = registroaeronautico;
    }

    // Métodos Getters e Setters

    public getRegistroaeronautico(){
        return registroaeronautico;
    }
    
    public setRegistroaeronautico(int registroaeronautico){
        this.registroaeronautico = registroaeronautico;
    
}

public void ligar(){
    
}

public void desligar(){
    System.out.println("Avião desligado");
}

public void mover_frente(){
    System.out.println("Avião movendo para frente");

}

public void ré(){
   
}

public void parar(){
    System.out.println("Avião parado");
}

}