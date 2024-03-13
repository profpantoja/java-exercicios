package main.Java;

public class Cryptographye {
    
    public void encrypt(String palavra, int chave) {
        int tamanhoDoTexto = palavra.length();
        StringBuilder textoCriptografia = new StringBuilder();

        for(int i = 0; i < tamanhoDoTexto; i++) {
            int letraASCII = ((int) palavra.charAt(i) + chave);

            if (letraASCII > 126) {
                letraASCII = 32 + (letraASCII - 127);
            }

            char letraCriptografia = (char) letraASCII;
            textoCriptografia.append(letraCriptografia);
        }

        System.out.println(textoCriptografia);
    }

    public void decrypt(String enigma, int chave) {
        int tamanhoDoTexto = enigma.length();
        StringBuilder textoDescriptografia = new StringBuilder();

        for(int i = 0; i < tamanhoDoTexto; i++) {
            int letraASCII = ((int) enigma.charAt(i) - chave);

            while (letraASCII < 32) {
                letraASCII += 94;
            }

            char letraDescriptografia = (char) letraASCII;
            textoDescriptografia.append(letraDescriptografia);
        }

        System.out.println(textoDescriptografia);
    }

}
