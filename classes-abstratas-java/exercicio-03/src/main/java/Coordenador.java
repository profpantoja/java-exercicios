public class Coordenador extends Publicacao {

    private String nome;
    private String email;
    private String instituicaoOrigem;
    private String endereco;
    private String funcao;

    public Coordenador (String titulo, String ano, String autores,String nome, String email, String instituicaoOrigem,String endereco, String funcao){
        super(titulo,ano,autores);
        this.nome = nome;
        this.email = email;
        this.instituicaoOrigem = instituicaoOrigem;
        this.endereco = endereco;
        this.funcao = funcao;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getInstituicaoOrigem() {
        return instituicaoOrigem;
    }

    public void setInstituicaoOrigem(String instituicaoOrigem) {
        this.instituicaoOrigem = instituicaoOrigem;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void imprimirInformacoes(){
        System.out.prinln();
    }

    
}
