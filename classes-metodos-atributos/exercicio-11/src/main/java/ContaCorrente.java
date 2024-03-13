package main.Java;

public class ContaCorrente {
    
    private int saldo;
    private int numero;
    private String cliente;
    private int limite;
    private String situacao;

    public ContaCorrente() {

    }

    public ContaCorrente(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
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

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void levantar(int valor) {
        if(valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
            System.out.println("Novo saldo: " + saldo);
        }
    }

    public void depositar(int valor) {
        saldo += valor;
        System.out.println("Novo saldo: " + saldo);
    }

    public void transferir(ContaCorrente destino, int valor) {
        if(valor > saldo) {
            System.out.println("Impossivel de fazer a transferencia!!");
        } else { 
            saldo -= valor;
            destino.saldo += valor;
            System.out.println("Saldo da sua conta: " + saldo);
            System.out.println("Saldo da conta: " + destino.saldo);
        }
    }

}
