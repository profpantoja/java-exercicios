public class ContaCorrente {
    private double saldo;
    private int numero;
    private String cliente;
    private double limite;
    private String situacao;

    public ContaCorrente(){

    }

    public ContaCorrente(double saldo, int numero, String cliente, double limite, String situacao){
        this.saldo = saldo;
        this.numero = numero;
        this.cliente = cliente;
        this.limite = limite;
        this.situacao = situacao;
    }

    public void sacar(double valor){
        double saque;
        if(this.situacao == "ativa"){
            if(this.saldo + this.limite >= valor){
                saque = valor;
                this.saldo -= valor;
                System.out.println("Saque de " + saque + " realizado.");
                System.out.println("Novo saldo: " + this.saldo);
            }
            else{
                System.out.println("Nao é possivel sacar, saldo insuficiente!");
            }
        }
        else{
            System.out.println("Conta inativa, nao e possivel sacar!");
        }
    }

    public void depositar(double valor){
        double deposito;
        deposito = valor;
        this.saldo += deposito;
        System.out.println("Deposito de: " + deposito);
        System.out.println("Novo saldo: " + this.saldo);
    }


    public void transferir(ContaCorrente outraConta, double valor){
        if(this.situacao == "ativa" && outraConta.situacao == "ativa"){
            if(this.saldo + this.limite >= valor){
                this.saldo -= valor;
                outraConta.saldo += valor;
                System.out.println("Transferencia de " + valor + " realizada com sucesso!");
                System.out.println("Novo saldo da conta que transferiu: " + this.saldo);
                System.out.println("Novo saldo da conta que recebeu a trasnferencia: " + outraConta.saldo);
            }
            else{
                System.out.println("Não é possivel transferir, saldo insuficiente");
            }
        }
        else{
            System.out.println("Uma das contas esta inativa!");
        }
    }
}
