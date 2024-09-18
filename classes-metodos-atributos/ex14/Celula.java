package ex14;

public class Celula {
    
    private static int numDeInstancias;



    public Celula(){
        numDeInstancias++;
        
    }



    public static int getNumDeInstancias() {
        return numDeInstancias;
    }
}