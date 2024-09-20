//Uma ONG chamada CãoNino, que cuida de cachorros abandonados, está precisando
//de um programa em Java para fazer o controle dos caninos que ela mantém em seu
//abrigo. Para isso ela precisa saber o nome, data de entrada no abrigo, se o animal
//possui raça, sua cor e peso para acompanhamento. Eventualmente, esses cachorros
//poderão ser adotados por almas caridosas. Contudo, a dona da ONG, deseja manter
//um cadastro das pessoas que adotam o animal. Dessa forma, para a pessoa é preciso
//saber seu nome, endereço, telefone, e-mail, sexo e, inclusive, qual o cão que está sendo
//adotado. Algumas informações sobre a adoção são mantidas em uma ficha de papel e
//também precisam ser informatizadas. As informações da ficha de adoção são: data de
//adoção, qual o cão foi adotado e quem adotou. Desenvolva o sistema acima criando
//suas respectivas classes e instancie os objetos de acordo com a tabela abaixo:
import java.time.LocalDate;

public class Ficha {

    private LocalDate dataAdocao;
    private Pet caoAdotado;
    private Pessoa adotante;

    public Ficha(LocalDate dataAdocao, Pet caoAdotado, Pessoa adotante) {
        this.dataAdocao = dataAdocao;
        this.caoAdotado = caoAdotado;
        this.adotante = adotante;
    }

    public Ficha() {
    }

    public LocalDate getDataAdocao() {
        return dataAdocao;
    }
    public void setDataAdocao(LocalDate dataAdocao) {
        this.dataAdocao = dataAdocao;
    }
    public Pet getCaoAdotado() {
        return caoAdotado;
    }
    public void setCaoAdotado(Pet caoAdotado) {
        this.caoAdotado = caoAdotado;
    }
    public Pessoa getAdotante() {
        return adotante;
    }
    public void setAdotante(Pessoa adotante) {
        this.adotante = adotante;
    }

    public void imprime(){
        System.out.println("Data de adocao: "+dataAdocao);
        System.out.println("Cachorro adotado: "+caoAdotado.getNome());
        System.out.println("Adtante: "+adotante.getNome());
    }
    

}