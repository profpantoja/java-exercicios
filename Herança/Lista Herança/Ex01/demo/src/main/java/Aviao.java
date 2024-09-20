public class Aviao extends Veiculo {
    private String registroAeronautico;

    boolean jaDecolou = true;
    boolean jaPousou = true;

    public Aviao() {
    }

    public Aviao(String registroAeronautico) {
        this.registroAeronautico = registroAeronautico;
    }

    public String getRegistroAeronautico() {
        return registroAeronautico;
    }

    public void setRegistroAeronautico(String registroAeronautico) {
        this.registroAeronautico = registroAeronautico;
    }

    public void decolar(){
        if(ligado == true && jaPousou == true ){
            System.out.println("O aviao decolou!");
            
        }
        else{
            System.out.println("O aviao esta desligado ou nao pousou, portanto, nao pode decolar!");
        }
    }

    public void pousar(){
        if(ligado == true && jaDecolou == true){
            System.out.println("O aviao pousou!");
        }
        else{
            System.out.println("O aviao esta desligado ou nao decolou, portanto, nao pode decolar!");
        }
        
    }






//O avi˜ao n˜ao pode pousar se n˜ao tiver decolado e vice-versa.


}
