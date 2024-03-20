package pantojava.lista02.ex01.src.main.java;

public class Pessoa {

    private String name;
    private String cpf;
    private Endereco endereco;
    private Contato contatos;
    private char sexo;

    public Pessoa() {
        this.name = null;
        this.cpf = null;
        this.endereco = null;
        this.contatos = null;
        this.sexo = ' ';
    }

    public Pessoa(String name, String cpf, Endereco endereco, Contato contatos, char sexo) {
        this.name = name;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contatos = contatos;
        this.sexo = sexo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Contato getContatos() {
        return contatos;
    }
    public void setContatos(Contato contatos) {
        this.contatos = contatos;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
}
