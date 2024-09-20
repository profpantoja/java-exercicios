class Tese extends Publicacao {
    private String grau;
    private String instituicao;

    public Tese(String titulo, int ano, String[] autores, String grau, String instituicao) {
        super(titulo, ano, autores);
        this.grau = grau;
        this.instituicao = instituicao;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
        System.out.println("Grau: " + grau);
        System.out.println("Instituição: " + instituicao);
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    

}
