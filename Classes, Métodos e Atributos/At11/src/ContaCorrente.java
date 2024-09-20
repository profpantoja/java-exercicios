public class ContaCorrente {
    
private double saldo;
private int numero;
private String cliente;
private double limite;
private String situação = "ATIVA";

public ContaCorrente(double saldo, int numero, String cliente, double limite, String situação) {
    this.saldo = saldo;
    this.numero = numero;
    this.cliente = cliente;
    this.limite = limite;
    this.situação = situação;
}


public double getSaldo() {
    return saldo;
}
public void setSaldo(double saldo) {
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
public double getLimite() {
    return limite;
}
public void setLimite(double limite) {
    this.limite = limite;
}
public String getSituação() {
    return situação;
}
public void setSituação(String situação) {
    this.situação = situação;
}


public void levantar(double sacar){
    if (sacar>getLimite()) {
        System.out.println("SALDO INSUFICIENTE");
    }else{
        setLimite(getLimite()-sacar);
        System.out.println("Saque realizado! Imprimindo Comprovante");
    }
}

public void depositar(double deposito){
setSaldo(getSaldo()+deposito);
setLimite(getLimite()+deposito);
System.out.println("Deposito realizado no valor de "+deposito);
}

public void transferir(double transferencia , double conta){
    if (transferencia>getLimite()) {
        System.out.println("Saldo Insuficiente para a transferencia");
    }
    else{
        setLimite(getLimite()-transferencia);
        System.out.println("Transfrencia realizada com sucesso para a conta:"+conta+"no valor de "+transferencia);
    }
}




public void infos(){
    System.out.println("Cliente: "+getCliente());
    System.out.println("Nº Conta: "+getNumero());
    System.out.println("Saldo: "+getSaldo());
    System.out.println("Limite: "+getLimite());
    System.out.println("Situção: "+getSituação());
}

}
