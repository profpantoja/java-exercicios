
public class Pessoa {
    private String nome;
    private String apelido;
    private int dia;
    private int mes;
    private int ano;
    private int idade;
    
    public Pessoa(){

    }

    public Pessoa(String nome, String apelido){
        this.nome = nome;
        this.apelido = apelido;

    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getApelido(){
        return this.apelido;
    }

    public void setApelido(String apelido){
        this.apelido = apelido;
    }  

    public void setData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int diaA, int mesA, int anoA){
        idade = anoA - this.ano;
        if(mesA < this.mes){
            idade--;
        }
        if(mesA == this.mes && diaA < this.dia){
            idade--;
        }
    }
        

}
