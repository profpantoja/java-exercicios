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
        char[] arrayTexto = texto.toCharArray(); // Converte o texto em um array de caracteres
        int tamanho = arrayTexto.length;
        
        // Inverte a ordem dos caracteres no array
        for (int i = 0; i < tamanho / 2; i++) {
            char temp = arrayTexto[i];
            arrayTexto[i] = arrayTexto[tamanho - 1 - i];
            arrayTexto[tamanho - 1 - i] = temp;
        }

        System.out.println("Texto invertido: " + new String(arrayTexto));
    }

    // Método para imprimir o array de inteiros
    private void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    
}