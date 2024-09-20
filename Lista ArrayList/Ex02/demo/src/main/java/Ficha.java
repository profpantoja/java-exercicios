//Agora, no momento da adoção, é preciso fazer algumas verificações e validações antes
//de se efetivar uma adoção. Primeiramente uma adoção não pode ocorrer em uma data
// anterior a data da entrada do cachorro na CãoNino. Seu sistema também deve permitir
//a substituição de pessoas em cada adoção. Algumas informações são importantes para
//a gestora do CãoNino como: quanto tempo um cachorro ficou na ONG, se o cachorro
//está bem nutrido ou não (utilize uma escala de 0 a 20kg - Desnutrido; 21Kg a 30Kg –
//Normal; e acima 30Kg – Obeso) e a quanto tempo o cachorro está adotado. Implemente
//as funções e procedimentos para estes casos.

import java.time.LocalDate;
import java.time.Duration;
public class Ficha {

    private LocalDate dataAdocao;
    private Pet PetAdotado;
    private Pessoa adotante;

    public Ficha(LocalDate dataAdocao, Pet PetAdotado, Pessoa adotante) {
        this.dataAdocao = dataAdocao;
        this.PetAdotado = PetAdotado;
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
    public Pet getPetAdotado() {
        return PetAdotado;
    }
    public void setPetAdotado(Pet PetAdotado) {
        this.PetAdotado = PetAdotado;
    }
    public Pessoa getAdotante() {
        return adotante;
    }
    public void setAdotante(Pessoa adotante) {
        this.adotante = adotante;
    }

    public void duracao(){
        Duration d1 = Duration.between(PetAdotado.getDataEntrada().atTime(0, 0), dataAdocao.atTime(0, 0));
        System.out.println("Dias que ficou na ONG: " + d1.toDays() + " dias.");
    }
 
    public void duracaoPetAdotado(){
        LocalDate agora = LocalDate.now();
        Duration d2 = Duration.between(dataAdocao.atTime(0, 0), agora.atTime(0, 0));
        System.out.println("Dias em que esta adotado: " + d2.toDays() + " dias.");
    }

    public boolean estaAdotado(){
        if(PetAdotado.getDataEntrada().isBefore(dataAdocao)){
            System.out.println("Adocao realizada com sucesso!");
            return true;
        }
        else{
            System.out.println("Adocao negada! Este animal ainda nao deu entrada.");
            return false;
        }
    }

    public void imprime(){
        if(estaAdotado()){
            System.out.println("Nome do adotante: "+adotante.getNome());
            System.out.println("Email do adotante: "+adotante.getEmail());
            System.out.println("Especie: "+PetAdotado.getEspecie());
            if(this.getPetAdotado().temRaca()){
                System.out.println("Raca: "+PetAdotado.getRaca());
            }
            else{
                System.out.println("Sem raca.");
            }
        }
        System.out.println("Pet adotado: "+PetAdotado.getNome());
        PetAdotado.nutrido();
        System.out.println("Data de adocao: "+dataAdocao);
        duracao();
        duracaoPetAdotado();
    }
    
}