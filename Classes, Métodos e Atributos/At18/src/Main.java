import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando o fornecedor
        Fornecedor fornecedor = new Fornecedor("Fornecedor X", "1234-5678", "Rua ABC", "00.000.000/0001-00");

        // Criando as mercadorias
        Mercadoria mercadoria1 = new Mercadoria("Produto 1", 100.0, LocalDate.of(2024, 12, 31), fornecedor);
        Mercadoria mercadoria2 = new Mercadoria("Produto 2", 50.0, LocalDate.of(2023, 1, 1), fornecedor);  // Expirada
        Mercadoria mercadoria3 = new Mercadoria("Produto 3", 70.0, LocalDate.of(2024, 5, 20), fornecedor);

        // Criando o carrinho
        Carrinho carrinho = new Carrinho();

        // Adicionando mercadorias ao carrinho
        carrinho.adicionarMercadoria(mercadoria1);
        carrinho.adicionarMercadoria(mercadoria2);  // Não deve ser adicionada
        carrinho.adicionarMercadoria(mercadoria3);

        // Exibindo o quantitativo total e valor total
        System.out.println("Total de itens no carrinho: " + carrinho.calcularTotalItens());
        System.out.println("Valor total da compra: R$ " + carrinho.calcularValorTotal());

        // Exibindo a quantidade de cada item
        carrinho.exibirQuantitativoPorItem();
    }
}
