package ex11;

public class ContaCorrente {

    private Double saldo;
    private int numero;
    private String cliente;
    private Double limite;
    private boolean situacao;

    public void saque(Double valor){

        if(valor > 0) {
            if(valor <= saldo) {
                this.saldo = saldo - valor;
            } else {
                System.out.println("Saldo insuficiente! Saldo atual: " + this.saldo);
            }
        }         
         
    }
    public void depositar(Double valor){
        if(valor < limite){
            setSaldo(saldo + valor);
        }else{
            System.out.println("Limite atingido!"); 
        }
    }

    public void transferir(ContaCorrente conta1, ContaCorrente conta2, double valor){
        conta1.saque(valor);
        conta2.depositar(valor);
        
    }
    
    public ContaCorrente(Double saldo, int numero, String cliente, Double limite, boolean situacao) {
        this.saldo = saldo;
        this.numero = numero;
        this.cliente = cliente;
        this.limite = limite;
        this.situacao = situacao;
    }

    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public Double getLimite() {
        return limite;
    }
    public void setLimite(Double limite) {
        this.limite = limite;
    }
    public boolean isSituacao() {
        return situacao;
    }
    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    
    
}
