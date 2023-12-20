public class Livro extends Publicacoes {

    private String editora;
    private String localPublicacao;

    public Livro(String titulo, String ano, String autores, String editora, String localPublicacao ){
        super(titulo, ano, autores);
        this.editora = editora;
        this.localPublicacao = localPublicacao;
    }


    public int getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getLocalPublicacao() {
        return localPublicacao;
    }

    public void setLocalPublicacao(String localPublicacao) {
        this.localPublicacao = localPublicacao;
    }

    

    public void imprimirInformacoes(){
        System.out.prinln();
    }
    
}
