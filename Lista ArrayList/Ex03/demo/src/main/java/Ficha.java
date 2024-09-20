// Em seguida, no seu método main crie um ArrayList de adoções e verifique:
// a. Se existe algum cachorro dado um nome;
// b. Qual o cachorro com mais tempo de adotado;
// c. Quantos cachorros da raça Vira Lata foram adotados.

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
            return true;
        }
        else{
            return false;
        }
    }

    public void imprime(){
        if(estaAdotado()){
            System.out.println("Adocao realizada com sucesso!");
            System.out.println("Nome do adotante: "+adotante.getNome());
            System.out.println("Email do adotante: "+adotante.getEmail());
            System.out.println("Especie: "+PetAdotado.getEspecie());
            if(this.getPetAdotado().temRaca()){
                System.out.println("Raca: "+PetAdotado.getRaca());
            }
            else{
                System.out.println("Sem raca.");
            }
            System.out.println("Pet adotado: "+PetAdotado.getNome());
            PetAdotado.nutrido();
            System.out.println("Data de adocao: "+dataAdocao);
            duracao();
            duracaoPetAdotado();
        }
        System.out.println("Adocao negada! Este animal ainda nao deu entrada."); 
    }
    
}