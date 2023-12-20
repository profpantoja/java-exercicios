package main.java;

public class Aviao extends Veiculo {

    private int registroAeronautico;

    public Aviao(){

    }

    public Aviao (int registroAeronautico){
        this.registroAeronautico = registroAeronautico;
    }

    // Métodos Getters e Setters

    public getRegistroAeronautico(){
        return registroAeronautico;
    }
    
    public setRegistroAeronautico(int registroAeronautico){
        this.registroAeronautico = registroAeronautico;
    
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