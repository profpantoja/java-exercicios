import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedir ao usuário para inserir o tamanho do array de inteiros
        System.out.print("Informe o tamanho do array: ");
        int tamanho = entrada.nextInt();

        // Criar o array com o tamanho informado
        int[] array = new int[tamanho];

        // Ler os elementos do array de inteiros
        System.out.println("Insira os números do array:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = entrada.nextInt();
        }

        // Instanciando a classe OrdenacaoComArrays
        OrdenacaoComArrays ordenacao = new OrdenacaoComArrays();

        // Ordenar em ordem crescente
        ordenacao.ordenarCrescente(array.clone());

        // Ordenar em ordem decrescente
        ordenacao.ordenarDecrescente(array.clone());

        // Pedir ao usuário para inserir um texto para inverter
        System.out.print("Digite um texto para inverter: ");
        entrada.nextLine();  // Limpa o buffer
        String texto = entrada.nextLine();

        // Invertendo o texto inserido
        ordenacao.inverterTexto(texto);
        entrada.close();
    }
}
