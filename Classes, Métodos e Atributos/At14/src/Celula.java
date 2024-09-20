public class Celula {
    
    private static int contadorInstacia = 0;

    public Celula(){
        contadorInstacia++;

        System.out.println("Instancia realizada");

    }

    public static  int getContadorInstancia(){
        return contadorInstacia;
    }



    
}
