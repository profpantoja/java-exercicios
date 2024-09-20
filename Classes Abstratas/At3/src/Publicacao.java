abstract class Publicacao {
    protected String titulo;
    protected int ano;
    protected String[] autores;

    public Publicacao(String titulo, int ano, String[] autores) {
        this.titulo = titulo;
        this.ano = ano;
        this.autores = autores;
    }

    public abstract void imprimirInformacoes();
}
