import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NotaFiscal {
    private int numeroNotaFiscal;
    private LocalDate dataCompra;
    private double valorCompra;
    private String nomeComprador;
    private String enderecoComprador;
    private String telefoneComprador;
    private boolean valorPago;
    private String cpfComprador;

    // Construtor
    public NotaFiscal(int numeroNotaFiscal, LocalDate dataCompra, double valorCompra, 
                      String nomeComprador, String telefoneComprador, String cpfComprador) {
        this.numeroNotaFiscal = numeroNotaFiscal;
        this.dataCompra = dataCompra;
        this.valorCompra = valorCompra;
        this.nomeComprador = nomeComprador;
        this.telefoneComprador = telefoneComprador;
        this.cpfComprador = cpfComprador;
        this.valorPago = false;  // Inicialmente, o valor não foi pago
    }

    // Getters e Setters
    public int getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public String getEnderecoComprador() {
        return enderecoComprador;
    }

    public void setEnderecoComprador(String enderecoComprador) {
        this.enderecoComprador = enderecoComprador;
    }

    public String getTelefoneComprador() {
        return telefoneComprador;
    }

    public void setTelefoneComprador(String telefoneComprador) {
        this.telefoneComprador = telefoneComprador;
    }

    public boolean isValorPago() {
        return valorPago;
    }

    public void setValorPago(boolean valorPago) {
        this.valorPago = valorPago;
    }

    public String getCpfComprador() {
        return cpfComprador;
    }

    // Método para calcular o valor a pagar com juros simples de 0,95% por dia de atraso
    public double calcularValorComJuros(LocalDate dataPagamento) {
        if (valorPago) {
            return 0;  // Se o valor já foi pago, não há nada a pagar
        }

        long diasAtraso = ChronoUnit.DAYS.between(dataCompra, dataPagamento);

        if (diasAtraso <= 0) {
            return valorCompra;  // Sem atraso, retorna o valor original
        }

        double juros = 0.0095 * diasAtraso;  // 0.95% ao dia
        double valorComJuros = valorCompra * (1 + juros);

        return valorComJuros;
    }
}
