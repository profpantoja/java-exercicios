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

    // Método para imprimir o array
    private void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}