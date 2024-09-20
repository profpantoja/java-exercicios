public class Main {
    

    public static void main(String[] args) {
        Cryptographye cryptography = new Cryptographye();

        // Testando criptografia
        String originalText = "missao impossivel";
        String encryptedText = cryptography.encrypt(originalText);
        System.out.println("Texto Criptografado: " + encryptedText);

        // Testando descriptografia
        String decryptedText = cryptography.decrypt(encryptedText);
        System.out.println("Texto Descriptografado: " + decryptedText);
    }
}


