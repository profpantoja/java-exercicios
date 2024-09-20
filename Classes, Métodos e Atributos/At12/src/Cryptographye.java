public class Cryptographye {

    // Deslocamento da cifra de César
    private static final int SHIFT = 3;

    // Método para criptografar (encrypt)
    public String encrypt(String text) {
        return processText(text, SHIFT);
    }

    // Método para descriptografar (decrypt)
    public String decrypt(String text) {
        return processText(text, -SHIFT);
    }

    // Método auxiliar para processar o texto, seja para criptografia ou descriptografia
    private String processText(String text, int shift) {
        char[] chars = text.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];

            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                chars[i] = (char) ((ch - base + shift + 26) % 26 + base);
            }
        }
        
        return new String(chars);
    }
}