package ex15;



public class Ordernar {
    
    public static void ordernarCrescnte(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
               if(array[i] > array[j]){
                int temp = array[i];      
                array[i] = array[j];
                array[j] = temp;

               } 
            }
        }
        
        for(int k = 0; k < array.length; k++){
            System.out.println(array[k]);
        }    
    }

    public static void ordernarDecrescente(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1 ; j < array.length; j++){
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            } 
        }
        System.out.println("  ");
        for(int k = 0; k < array.length; k++){
            System.out.println(array[k]);
        }

        
    }        
}
