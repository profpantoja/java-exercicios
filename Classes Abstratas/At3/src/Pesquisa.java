import java.time.LocalDate;

class Pesquisa {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private String areaPesquisa;
    private Coordenador coordenador;

    public Pesquisa(String nome, String descricao, LocalDate dataInicio, LocalDate dataTermino, String areaPesquisa, Coordenador coordenador) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.areaPesquisa = areaPesquisa;
        this.coordenador = coordenador;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Área de Pesquisa: " + areaPesquisa);
        coordenador.imprimirInformacoes();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }

    public void setAreaPesquisa(String areaPesquisa) {
        this.areaPesquisa = areaPesquisa;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }



    

}
