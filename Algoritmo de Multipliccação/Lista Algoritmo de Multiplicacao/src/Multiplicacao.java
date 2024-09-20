import java.math.BigInteger;

public class Multiplicacao {

    // Multiplicação padrão recursiva
    public static BigInteger multPadrao(BigInteger a, BigInteger b) {
        if (a.compareTo(BigInteger.TEN) < 0 || b.compareTo(BigInteger.TEN) < 0) {
            return a.multiply(b);
        }

        int n = Math.max(a.toString().length(), b.toString().length());
        n = (n / 2) + (n % 2);

        // Dividir os números
        BigInteger A1 = a.divide(BigInteger.TEN.pow(n));
        BigInteger A0 = a.mod(BigInteger.TEN.pow(n));
        BigInteger B1 = b.divide(BigInteger.TEN.pow(n));
        BigInteger B0 = b.mod(BigInteger.TEN.pow(n));

        // Recursões
        BigInteger A1B1 = multPadrao(A1, B1);
        BigInteger A0B0 = multPadrao(A0, B0);
        BigInteger A1B0_A0B1 = multPadrao(A1, B0).add(multPadrao(A0, B1));

        // Combinar resultados
        return A1B1.multiply(BigInteger.TEN.pow(2 * n)).add(A1B0_A0B1.multiply(BigInteger.TEN.pow(n))).add(A0B0);
    }

    // Multiplicação Karatsuba recursiva
    public static BigInteger multKaratsuba(BigInteger a, BigInteger b) {
        if (a.compareTo(BigInteger.TEN) < 0 || b.compareTo(BigInteger.TEN) < 0) {
            return a.multiply(b);
        }

        int n = Math.max(a.toString().length(), b.toString().length());
        n = (n / 2) + (n % 2);

        // Dividir os números
        BigInteger A1 = a.divide(BigInteger.TEN.pow(n));
        BigInteger A0 = a.mod(BigInteger.TEN.pow(n));
        BigInteger B1 = b.divide(BigInteger.TEN.pow(n));
        BigInteger B0 = b.mod(BigInteger.TEN.pow(n));

        // Recursões
        BigInteger A1B1 = multKaratsuba(A1, B1);
        BigInteger A0B0 = multKaratsuba(A0, B0);
        BigInteger M3 = multKaratsuba(A1.add(A0), B1.add(B0)).subtract(A1B1).subtract(A0B0);

        // Combinar resultados
        return A1B1.multiply(BigInteger.TEN.pow(2 * n)).add(M3.multiply(BigInteger.TEN.pow(n))).add(A0B0);
    }

    // Função para soma bit a bit (binário)
    public static String somaBinaria(String num1, String num2) {
        BigInteger a = new BigInteger(num1, 2);
        BigInteger b = new BigInteger(num2, 2);
        return a.add(b).toString(2);
    }

    // Função para subtração bit a bit (binário)
    public static String subtracaoBinaria(String num1, String num2) {
        BigInteger a = new BigInteger(num1, 2);
        BigInteger b = new BigInteger(num2, 2);
        return a.subtract(b).toString(2);
    }

    // Função para multiplicar números binários usando Karatsuba
    public static String multBinaria(String num1, String num2) {
        BigInteger a = new BigInteger(num1, 2);
        BigInteger b = new BigInteger(num2, 2);
        return multKaratsuba(a, b).toString(2);
    }
}
