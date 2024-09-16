public class Main {
    public static void main(String[] args) throws Exception {
        
        ContaCorrente conta1 = new ContaCorrente(1000);
        ContaCorrente conta2 = new ContaCorrente(12000);

        conta1.depositar(5000);

        conta2.levantar(15000);

        conta1.levantar(3000);

        conta1.transferir(conta2, 4000);
        conta2.transferir(conta1, 4000);

    }
}
