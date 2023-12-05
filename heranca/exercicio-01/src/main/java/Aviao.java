public class Aviao {
    

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

    public void decolar(){
        if(Aviao != pousar()){
        System.out.println("Avião não decolou !");

    }

    public void pousar(){
        if(Aviao == pousar()){
        System.out.println("Avião decolou !");


    }
    }
}