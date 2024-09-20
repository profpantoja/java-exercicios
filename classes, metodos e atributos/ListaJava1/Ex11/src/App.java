public class App {
    public static void main(String[] args) {
        
        ContaCorrente c1 = new ContaCorrente(1000, 67452, "Rafael", 2000, "ativa");
        ContaCorrente c2 = new ContaCorrente(500, 89321, "Joao", 1200, "ativa");

        c1.sacar(200);
        c2.sacar(100);

        c1.depositar(500);
        c2.depositar(600);

        c1.transferir(c2, 250);
    }
}
