package main.java;

public abstract class Publicacoes{

    private String titulo;
    private String ano;
    private String autores;

    public Publicacoes(String titulo, String ano, String autores){
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

public String getAutores(){
    return autores;
}

public void setAutores(String autores) {
    this.autores = autores;
}

public abstract void imprimirInformacoes();


    
}