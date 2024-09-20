// Em seguida, no seu método main crie um ArrayList de adoções e verifique:
// a. Se existe algum cachorro dado um nome;
// b. Qual o cachorro com mais tempo de adotado;
// c. Quantos cachorros da raça Vira Lata foram adotados.

public class Pessoa {
    private String nome; 
    private String endereco; 
    private String telefone; 
    private String email; 
    private String sexo; 
   // private Pet qualCao;

    public Pessoa(String nome, String endereco, String telefone, String email, String sexo) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
    }
    
    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
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
    

    

}
