package ArrayList;

public class Pessoa {

    private String nome;
    private String endereco;
    private int telefone;
    private String email;
    private String sexo;
    private Cao caoAdotado;

    public Pessoa(){


    }

    public Pessoa(String nome, String endereco, int telefone, String email, String sexo, Cao caoAdotado) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.caoAdotado = caoAdotado;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Cao getCaoAdotado() {
        return caoAdotado;
    }

    public void setCaoAdotado(Cao caoAdotado) {
        this.caoAdotado = caoAdotado;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    

}
