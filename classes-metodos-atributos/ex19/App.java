package ex19;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        NotaFiscal notaFiscal = new NotaFiscal();
        LocalDate diaDoPagamento = LocalDate.of(2024, 4, 30);
        System.out.println(notaFiscal.valorAserPago(diaDoPagamento, 100));
        
    }
}
