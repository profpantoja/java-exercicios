package org.example3;

public class Coordenador {
    private String nome;
    private String email;
    private String instituicao;
    private String endereco;
    private String funcao;

    public Coordenador(String nome, String email, String instituicao, String endereco, String funcao) {
        this.nome = nome;
        this.email = email;
        this.instituicao = instituicao;
        this.endereco = endereco;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}