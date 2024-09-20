import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando uma nota fiscal
        NotaFiscal nota = new NotaFiscal(1234, LocalDate.of(2024, 8, 15), 500.00, 
                                         "João Silva", "1234-5678", "123.456.789-00");

        // Exibindo o valor original da compra
        System.out.println("Valor original da compra: R$ " + nota.getValorCompra());

        // Calculando o valor com juros (supondo pagamento com 10 dias de atraso)
        LocalDate dataPagamento = LocalDate.of(2024, 8, 25);
        double valorComJuros = nota.calcularValorComJuros(dataPagamento);

        System.out.println("Valor com juros (10 dias de atraso): R$ " + valorComJuros);
    }
}
