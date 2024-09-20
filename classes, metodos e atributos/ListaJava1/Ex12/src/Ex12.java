public class Ex12 {
    public static void main(String[] args)  {
        String palavra = "Hello World!";
        String palavraCriptografada = encrypt(palavra);
        System.out.println("Palavra criptografada: " + palavraCriptografada);

        String palavraDescriptografada = decrypt("palavra");
        System.out.println("Palavra descriptografada: " + palavraDescriptografada);
    }
 }
