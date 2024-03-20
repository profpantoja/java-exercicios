package pantojava.lista02.ex01.src.main.java;

public class Endereco {

    private String cep;
    private String rua;
    private String bairro;
    private String cidade;
    private int numero;

    public Endereco() {
        this.cep = null;
        this.rua = null;
        this.bairro = null;
        this.cidade = null;
        this.numero = 0;
    }  
    
    public Endereco(String cep, String rua, String bairro, String cidade, int numero) {
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    

}
