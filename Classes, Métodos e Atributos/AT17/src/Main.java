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

        // Identificar o maior número
        int maior = ordenacao.encontrarMaior(array);
        System.out.println("Maior número: " + maior);

        // Identificar o menor número
        int menor = ordenacao.encontrarMenor(array);  // Corrigido: usar encontrarMenor
        System.out.println("Menor número: " + menor);

        // Calcular a média
        double media = ordenacao.calcularMedia(array);
        System.out.println("Média: " + media);

        // Calcular o desvio padrão
        double desvioPadrao = ordenacao.calcularDesvioPadrao(array);
        System.out.println("Desvio padrão: " + desvioPadrao);

        // Invertendo um texto inserido pelo usuário
        System.out.print("Digite um texto para inverter: ");
        entrada.nextLine();  // Limpa o buffer
        String texto = entrada.nextLine();
        ordenacao.inverterTexto(texto);
    }
}
