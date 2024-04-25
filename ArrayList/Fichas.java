package ArrayList;

import java.time.LocalDate;
import java.time.Period;


public class Fichas {

    private LocalDate dataDeAdocao;
    private Cao caoAdotado;
    private Pessoa quemAdotou;

    public Fichas(){

    }

    public Fichas(LocalDate dataDeAdocao, Cao caoAdotado, Pessoa quemAdotou) {
        if(dataDeAdocao.isBefore(caoAdotado.getDataDeEntrada())){
            System.out.println("Data de data de adoção inválida!");

        }else{
            this.dataDeAdocao = dataDeAdocao;
        }
        this.caoAdotado = caoAdotado;
        this.quemAdotou = quemAdotou;
    }

    public void substituirPessoa(Fichas ficha, Pessoa pessoa){
        
        ficha.quemAdotou = pessoa;
    }

    public void periodoNaONG(){
        Period periodo = Period.between(quemAdotou.getCaoAdotado().getDataDeEntrada(), this.dataDeAdocao);
        System.out.println("O cão " + quemAdotou.getCaoAdotado().getNome() + " permaneceu por " + periodo.getDays() + " dia(s), " + periodo.getMonths() + " mes(es) e " + periodo.getYears() + " ano(s)");
    }

    public void nutricao(){
        if(caoAdotado.getPeso() >= 0.0 && caoAdotado.getPeso() <= 20.0){
            System.out.println("Cão Desnutrido.\n");
        }else if(caoAdotado.getPeso() >= 21.0 && caoAdotado.getPeso() <= 30.0){
            System.out.println("Cão com a nutrição Normal.\n");
        }else{
            System.out.println("Cão Obeso.\n");
        }
    }

    public Period periodoAdotado(){
        Period periodoAdotado = Period.between(dataDeAdocao, LocalDate.now());
        
        return periodoAdotado;
    }

    public LocalDate getDataDeAdocao() {
        return dataDeAdocao;
    }

    public void setDataDeAdocao(LocalDate dataDeAdocao) {
        this.dataDeAdocao = dataDeAdocao;
    }

    public Cao getCaoAdotado() {
        return caoAdotado;
    }

    public void setCaoAdotado(Cao caoAdotado) {
        this.caoAdotado = caoAdotado;
    }

    public Pessoa getQuemAdotou() {
        return quemAdotou;
    }

    public void setQuemAdotou(Pessoa quemAdotou) {
        this.quemAdotou = quemAdotou;
    }

    


    
    

}
