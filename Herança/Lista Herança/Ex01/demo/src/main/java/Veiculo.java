//
public class Veiculo {
    
    boolean ligado = false;
    boolean isParado = false;

    public boolean ligar(){
        if(ligado == false){
            System.out.println("O veiculo ligou!");
            ligado = true;
            return true;
        }
        else{
            System.out.println("O veiculo ja esta ligado!");
            return false;
        }
        
    }

    public boolean desligar(){
        if(ligado == true){
            System.out.println("O veiculo desligou!");
            ligado = false;
            isParado = true;
            return true;
        }
        else{
            System.out.println("O veiculo ja esta desligado");
            isParado = true;
            return false;
        }
    }

    public void moverFrente(){
       if(ligado == true){
          System.out.println("O veiculo moveu para frente!");  
       }
       else{
          System.out.println("O veiculo esta desligado, impossivel mover-se para frente!");   
       }
    }

    public void marchaRe(){
        if(ligado == true){
            System.out.println("O veiculo deu re");  
         }
         else{
            System.out.println("O veiculo esta desligado, impossivel dar re!");   
         }
        
    }

    public void parar(){
        if(ligado == true){
            System.out.println("O veiculo parou!"); 
            isParado = true; 
         }
         else{
            System.out.println("O veiculo esta desligado, portanto, ja esta parado!");
            isParado = true;   
         }
        
    }

}
