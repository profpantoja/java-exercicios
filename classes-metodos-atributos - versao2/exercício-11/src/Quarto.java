public class Quarto {

    private boolean status;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
    
     //Este metodo vai colocar em status true, que significa que a lãmpada está ligada
    
    public void ligar(){
        status = true;
    }
   
   
     //Este metodo vai colocar em status false, que significa que a lãmpada está desligada
     
    public void desligar(){
        status = false;
    }
    
     //Este método vai retornar para o main o status para que possa ser mostrado o estado da lampada

    public String observar(){
        if(status == true)
           return "ligada";
       else
        return "desligada";
    }
} 

    

