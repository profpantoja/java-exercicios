import java.util.Arrays;

public class OrdenacaoComArrays {

    // Método para ordenar o array em ordem crescente usando Arrays.sort()
    public void ordenarCrescente(int[] array) {
        Arrays.sort(array);
        System.out.println("Array em ordem crescente (usando Arrays.sort()):");
        imprimirArray(array);
    }

    // Método para ordenar o array em ordem decrescente usando Arrays.sort() e reverse
    public void ordenarDecrescente(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Array em ordem decrescente (usando Arrays.sort()):");
        imprimirArray(array);
    }

    // Novo método: inverte a ordem dos caracteres de um array de texto
    public void inverterTexto(String texto) {
        char[] arrayTexto = texto.toCharArray();
        int tamanho = arrayTexto.length;
        
        // Inverte a ordem dos caracteres no array
        for (int i = 0; i < tamanho / 2; i++) {
            char temp = arrayTexto[i];
            arrayTexto[i] = arrayTexto[tamanho - 1 - i];
            arrayTexto[tamanho - 1 - i] = temp;
        }

        System.out.println("Texto invertido: " + new String(arrayTexto));
    }

    // Método para identificar o maior número
    public int encontrarMaior(int[] array) {
        int maior = array[0];
        for (int num : array) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    // Método para identificar o menor número
    public int encontrarMenor(int[] array) {
        int menor = array[0];
        for (int num : array) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    // Método para calcular a média dos números
    public double calcularMedia(int[] array) {
        int soma = 0;
        for (int num : array) {
            soma += num;
        }
        return (double) soma / array.length;
    }

    // Método para calcular o desvio padrão
    public double calcularDesvioPadrao(int[] array) {
        double media = calcularMedia(array);
        double soma = 0;
        for (int num : array) {
            soma += Math.pow(num - media, 2);
        }
        return Math.sqrt(soma / array.length);
    }

    // Método para imprimir o array de inteiros
    private void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
