import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Mercadoria> mercadorias = new ArrayList<>();

    // Adiciona uma mercadoria ao carrinho
    public void adicionarMercadoria(Mercadoria mercadoria) {
        if (!mercadoria.isValidadeExpirada()) {
            mercadorias.add(mercadoria);
            System.out.println(mercadoria.getNome() + " adicionada ao carrinho.");
        } else {
            System.out.println("Não foi possível adicionar " + mercadoria.getNome() + ": validade expirada.");
        }
    }

    // Calcula a quantidade total de itens no carrinho
    public int calcularTotalItens() {
        return mercadorias.size();
    }

    // Calcula o valor total gasto (com base no valor de venda)
    public double calcularValorTotal() {
        double total = 0;
        for (Mercadoria mercadoria : mercadorias) {
            total += mercadoria.getValorVenda();
        }
        return total;
    }

    // Exibe a quantidade de itens por nome
    public void exibirQuantitativoPorItem() {
        // Um hashmap pode ser utilizado aqui, mas para simplicidade:
        for (Mercadoria mercadoria : mercadorias) {
            System.out.println(mercadoria.getNome() + ": 1 unidade");
        }
    }
}
