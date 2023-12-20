

public class Aviao extends Veiculo{
    

private int registroaeronautico;

    public Aviao (int registroaeronautico){
        super();
        this.registroaeronautico = registroaeronautico;

    }

    

    // Métodos Getters e Setters

    public int getRegistroaeronautico(){
        return registroaeronautico;
    }
    
    public void setRegistroaeronautico(int registroaeronautico){
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