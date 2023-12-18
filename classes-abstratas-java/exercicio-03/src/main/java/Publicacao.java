package main.java;

public abstract class Publicacao{

    private String titulo;
    private String ano;
    private List autores;

    public Publicacao(String titulo, String ano, String autores){
        this.titulo = titulo;
        this.ano = ano;
        this.autores = autores;
    }
    


    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno(){
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public List getAutores(){
        return autores;
    }

    public void setAutores(List autores) {
        this.autores = autores;
    }

    public abstract void imprimirInformacoes();


        
    }