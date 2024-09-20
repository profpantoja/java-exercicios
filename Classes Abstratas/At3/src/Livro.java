class Livro extends Publicacao {
    private String editora;
    private String localPublicacao;

    public Livro(String titulo, int ano, String[] autores, String editora, String localPublicacao) {
        super(titulo, ano, autores);
        this.editora = editora;
        this.localPublicacao = localPublicacao;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
        System.out.println("Editora: " + editora);
        System.out.println("Local de Publicação: " + localPublicacao);
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getLocalPublicacao() {
        return localPublicacao;
    }

    public void setLocalPublicacao(String localPublicacao) {
        this.localPublicacao = localPublicacao;
    }

    

}
