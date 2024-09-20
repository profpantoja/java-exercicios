import java.time.LocalDate;
import java.time.Period;

public class Adocao {
    private Cachorro cachorro;
    private Pessoa pessoa;
    private LocalDate dataAdocao;

    public Adocao(Cachorro cachorro, Pessoa pessoa, LocalDate dataAdocao) {
        this.cachorro = cachorro;
        this.pessoa = pessoa;
        this.dataAdocao = dataAdocao;
    }

    // Getters e Setters
    public Cachorro getCachorro() {
        return cachorro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public LocalDate getDataAdocao() {
        return dataAdocao;
    }

    @Override
    public String toString() {
        return "Adocao{" +
                "cachorro=" + cachorro +
                ", pessoa=" + pessoa +
                ", dataAdocao=" + dataAdocao +
                '}';
    }

    public void setCachorro(Cachorro cachorro) {
        this.cachorro = cachorro;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setDataAdocao(LocalDate dataAdocao) {
        this.dataAdocao = dataAdocao;
    }


    public void verificarAdoçao(){

        if (dataAdocao.isBefore(cachorro.getDataEntrada())) {
            System.out.println("Erro na adoção");
        } else {
            System.out.println("adoção realizada");
        }
    }

    public void trocarDono(Pessoa a){
        setPessoa(a);
    }

    
    public void hospedagem(){
        
        System.out.println(Period.between(cachorro.getDataEntrada(), dataAdocao));
    }

    private char[] Period(LocalDate dataEntrada, LocalDate dataAdocao2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Period'");
    }

    public void statusNutri(){
        if (cachorro.getPeso()<20) {
            System.out.println("Desbutrido");
        } else if(cachorro.getPeso()>20 & cachorro.getPeso()<30){
            System.out.println("Normal");
        }else if(cachorro.getPeso()>30){
            System.out.println("Obeso");
        }
    }
}
