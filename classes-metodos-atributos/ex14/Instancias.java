package ex14;

public class Instancias {
    public static void main(String[] args) {
        
        Celula c1 = new Celula();
        Celula c2 = new Celula();
        int numInstancias = Celula.getNumDeInstancias();
        System.out.println("Número de instâncias: " + numInstancias);
    }
}
