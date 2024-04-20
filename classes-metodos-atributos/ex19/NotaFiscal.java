package ex19;

import java.time.LocalDate;
import java.time.Period;

public class NotaFiscal {
    private int numNotaFiscal;
    private LocalDate data;
    private double valorDaCompra;
    private String nomeDoComprador;
    private String endereco;
    private int telefoneDoComprador;
    private boolean pagoOuNao;
    private int cpf;

    
    public NotaFiscal(int numNotaFiscal, LocalDate data, double valorDaCompra, String nomeDoComprador, int cpf, int telefoneDoComprador) {
        this.numNotaFiscal = numNotaFiscal;
        this.data = data;
        this.valorDaCompra = valorDaCompra;
        this.nomeDoComprador = nomeDoComprador;
        this.cpf = cpf;
        this.telefoneDoComprador = telefoneDoComprador;
    }

    public NotaFiscal(){


    }

    public double valorAserPago(LocalDate diaDoPagamento, double valor){
        LocalDate dataAtual = LocalDate.now();
        int diasDeAtraso = Period.between(dataAtual, diaDoPagamento).getDays();
        double novoValor = (valor + (valor * 0.0095)) * diasDeAtraso;
        return novoValor;

        
    }
    public int getNumNotaFiscal() {
        return numNotaFiscal;
    }
    public void setNumNotaFiscal(int numNotaFiscal) {
        this.numNotaFiscal = numNotaFiscal;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public double getValorDaCompra() {
        return valorDaCompra;
    }
    public void setValorDaCompra(double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }
    public String getNomeDoComprador() {
        return nomeDoComprador;
    }
    public void setNomeDoComprador(String nomeDoComprador) {
        this.nomeDoComprador = nomeDoComprador;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getTelefoneDoComprador() {
        return telefoneDoComprador;
    }
    public void setTelefoneDoComprador(int telefoneDoComprador) {
        this.telefoneDoComprador = telefoneDoComprador;
    }
    public boolean isPagoOuNao() {
        return pagoOuNao;
    }
    public void setPagoOuNao(boolean pagoOuNao) {
        this.pagoOuNao = pagoOuNao;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    
}
