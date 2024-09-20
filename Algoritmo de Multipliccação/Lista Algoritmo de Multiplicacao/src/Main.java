import java.math.BigInteger;

public class Main {
    
    public static void main(String[] args) {
        // Exemplos de multiplicação decimal
        System.out.println("Multiplicação Padrão:");
        System.out.println("8 x 5 = " + Multiplicacao.multPadrao(BigInteger.valueOf(8), BigInteger.valueOf(5)));
        System.out.println("62938427 x 32984729 = " + Multiplicacao.multPadrao(BigInteger.valueOf(62938427), BigInteger.valueOf(32984729)));
        System.out.println("3209094 x 246 = " + Multiplicacao.multPadrao(BigInteger.valueOf(3209094), BigInteger.valueOf(246)));
        System.out.println("23487 x 294582745 = " + Multiplicacao.multPadrao(BigInteger.valueOf(23487), BigInteger.valueOf(294582745)));
        System.out.println("234566778996867555342234234245 x 450294459842450836750959083096 = " + 
                Multiplicacao.multPadrao(new BigInteger("234566778996867555342234234245"), new BigInteger("450294459842450836750959083096")));
        System.out.println("1 x 0 = " + Multiplicacao.multPadrao(BigInteger.ONE, BigInteger.ZERO));

        // Exemplos de multiplicação binária
        System.out.println("\nMultiplicação Binária com Karatsuba:");
        System.out.println("11101101 x 11110100 = " + Multiplicacao.multBinaria("11101101", "11110100"));
        System.out.println("1111111 x 1100 = " + Multiplicacao.multBinaria("1111111", "1100"));
        System.out.println("1100 x 1111110 = " + Multiplicacao.multBinaria("1100", "1111110"));
        System.out.println("110101011101010111010101110101 x 110101010101111000000011111101 = " +
                Multiplicacao.multBinaria("110101011101010111010101110101", "110101010101111000000011111101"));

        // Soma e subtração bit a bit
        System.out.println("\nSoma bit a bit:");
        System.out.println("11101101 + 11110100 = " + Multiplicacao.somaBinaria("11101101", "11110100"));
        System.out.println("1111111 - 1100 = " + Multiplicacao.subtracaoBinaria("1111111", "1100"));
    }
}
