package ex18;

import java.time.LocalDate;


public class Mercado {

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Fornecedor X", "123456789", "Rua X, 123", "12345678901234");
        Fornecedor fornecedor2 = new Fornecedor("Fornecedor Y", "123454589", "Rua y, 321", "12343478901234");
    
    

        LocalDate validade1 = LocalDate.of(2025, 12, 11);

        LocalDate validade2 = LocalDate.of(2022, 12, 11);
        Item item1 = new Item("Ovo", 5.45, fornecedor, validade1);
        Item item2 = new Item("Carne", 40.76, fornecedor2, validade2);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(item1);
        carrinho.adicionarItem(item2);

        System.out.println("Quantidade total de itens: " + carrinho.getQuantidadeTotal());
        System.out.println("Quantidade de " + item1.getNome() + ": " + carrinho.getQuantidadePorItem(item1));
        System.out.println("Quantidade de " + item2.getNome() + ": " + carrinho.getQuantidadePorItem(item2));
        System.out.println("Valor total da compra: R$" + carrinho.getValorTotal()); 
        
            
            
            
    
        
        


        
    }

}
