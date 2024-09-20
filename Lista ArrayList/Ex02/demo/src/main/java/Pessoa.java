//Agora, no momento da adoção, é preciso fazer algumas verificações e validações antes
//de se efetivar uma adoção. Primeiramente uma adoção não pode ocorrer em uma data
// anterior a data da entrada do cachorro na CãoNino. Seu sistema também deve permitir
//a substituição de pessoas em cada adoção. Algumas informações são importantes para
//a gestora do CãoNino como: quanto tempo um cachorro ficou na ONG, se o cachorro
//está bem nutrido ou não (utilize uma escala de 0 a 20kg - Desnutrido; 21Kg a 30Kg –
//Normal; e acima 30Kg – Obeso) e a quanto tempo o cachorro está adotado. Implemente
//as funções e procedimentos para estes casos.


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
