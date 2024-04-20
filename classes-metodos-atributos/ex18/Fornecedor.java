package ex18;

public class Fornecedor {

    private String nome;
    private String telefone;
    private String endereco;
    private String cnpj;

    public Fornecedor(){
        
    }

    public Fornecedor(String nome, String telefone, String endereco, String cnpj) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

}
