public class Cryptographye {
    public static String encrypt(String palavra) {
        StringBuilder cifrado = new StringBuilder();
        int deslocamento = 3; // desloca três caracteres à frente

        for (int i = 0; i < palavra.length(); i++) {
            char caracter = palavra.charAt(i);
            if (Character.isLetter(caracter)) {
                char cifra = (char) (caracter + deslocamento);
                if ((Character.isUpperCase(caracter) && cifra > 'Z') || (Character.isLowerCase(caracter) && cifra > 'z')) {
                    cifra = (char) (caracter - (26 - deslocamento));
                }
                cifrado.append(cifra);
            } else {
                cifrado.append(caracter);
            }
        }
        return cifrado.toString();
    }

    // Método para descriptografar uma palavra usando a cifra de César
    public static String decrypt(String palavraCriptografada) {
        StringBuilder decifrado = new StringBuilder();
        int deslocamento = 3; // desloca três caracteres à frente

        for (int i = 0; i < palavraCriptografada.length(); i++) {
            char caracter = palavraCriptografada.charAt(i);
            if (Character.isLetter(caracter)) {
                char decifra = (char) (caracter - deslocamento);
                if ((Character.isUpperCase(caracter) && decifra < 'A') || (Character.isLowerCase(caracter) && decifra < 'a')) {
                    decifra = (char) (caracter + (26 - deslocamento));
                }
                decifrado.append(decifra);
            } else {
                decifrado.append(caracter);
            }
        }
        return decifrado.toString();
}
