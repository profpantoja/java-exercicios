package ex11;

public class Onze {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(10.0,1234, "Vitor Sant Anna", 10000.0, true);
        ContaCorrente c2 = new ContaCorrente(100.0, 4321, "Caio Abreu", 20000.0, true);
        c1.depositar(100.0);
        c2.depositar(200.0);
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
        c1.saque(120.0);
        
    
        





























        




        












    }
    
}
