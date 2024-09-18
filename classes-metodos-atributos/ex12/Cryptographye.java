package ex12;

public class Cryptographye {
    
    String abc = "abcdefghijklmnopqrstuvwxyz";
    String abc2 = "zyxwvutsrqponmlkjihgfedcba";    
    
    public void encrypt(String code){

        char[] array = code.toCharArray();
        char[] letters = abc.toCharArray();

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < 26; j++){
                if(array[i] == letters[j]){
                  int newJ = (j + 3) % 26;                
                  array[i] = letters[newJ];                 
                  break;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    
    public void decrypt(String code){
        char[] array2 = code.toCharArray();
        char[] letters = abc2.toCharArray();

        for(int i = 0; i < array2.length; i++){
            for(int j = 0; j < 26; j++){
                if(array2[i] == letters[j]){
                  int newJ = (j + 3) % 26;                
                  array2[i] = letters[newJ];                 
                  break;
                }
            }
        }        
        for(int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }
    }   
}
