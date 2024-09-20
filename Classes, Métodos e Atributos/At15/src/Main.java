import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir ao usuário para inserir o tamanho do array
        System.out.print("Informe o tamanho do array: ");
        int tamanho = scanner.nextInt();
        
        // Criar o array com o tamanho informado
        int[] array = new int[tamanho];
        
        // Ler os elementos do array
        System.out.println("Insira os números do array:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }

        // Instanciando a classe OrdenacaoComArrays
        OrdenacaoComArrays ordenacao = new OrdenacaoComArrays();

        // Ordenar em ordem crescente
        ordenacao.ordenarCrescente(array.clone());

        // Ordenar em ordem decrescente
        ordenacao.ordenarDecrescente(array.clone());
    }
}

