//Uma ONG chamada CãoNino, que cuida de cachorros abandonados, está precisando
//de um programa em Java para fazer o controle dos caninos que ela mantém em seu
//abrigo. Para isso ela precisa saber o nome, data de entrada no abrigo, se o animal
//possui raça, sua cor e peso para acompanhamento. Eventualmente, esses cachorros
//poderão ser adotados por almas caridosas. Contudo, a dona da ONG, deseja manter
//um cadastro das pessoas que adotam o animal. Dessa forma, para a pessoa é preciso
//saber seu nome, endereço, telefone, e-mail, sexo e, inclusive, qual o cão que está sendo
//adotado. Algumas informações sobre a adoção são mantidas em uma ficha de papel e
//também precisam ser informatizadas. As informações da ficha de adoção são: data de
//adoção, qual o cão foi adotado e quem adotou. Desenvolva o sistema acima criando
//suas respectivas classes e instancie os objetos de acordo com a tabela abaixo:


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
