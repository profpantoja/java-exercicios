// Faça o mesmo para todos os objetos cachorros e verifique:
// a. Quantos cachorros estão desnutridos;
// b. Quantos cachorros são vira latas;
// c. Quantos cachorros são da cor Amarela.

import java.time.LocalDate;
import java.time.Duration;

public class Ficha {
    private LocalDate dataAdocao;
    private Pet petAdotado;
    private Pessoa adotante;
    
    public Ficha() {
    }

    public Ficha(LocalDate dataAdocao, Pet petAdotado, Pessoa adotante) {
        this.dataAdocao = dataAdocao;
        this.petAdotado = petAdotado;
        this.adotante = adotante;
    }

    public LocalDate getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(LocalDate dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public Pet getPetAdotado() {
        return petAdotado;
    }

    public void setPetAdotado(Pet petAdotado) {
        this.petAdotado = petAdotado;
    }

    public Pessoa getAdotante() {
        return adotante;
    }

    public void setAdotante(Pessoa adotante) {
        this.adotante = adotante;
    }

    public boolean estaAdotado(){
        if(petAdotado.getDataEntrada().isBefore(dataAdocao)){
            return true;
        }
        else{
            return false;
        }
    }

    public void tempoNaOng(){
        Duration d1 = Duration.between(petAdotado.getDataEntrada().atTime(0, 0), dataAdocao.atTime(0, 0));
        System.out.println("Dias que ficou na ONG: " + d1.toDays() + " dias.");
    }

    public void tempoAdotado(){
        LocalDate agora = LocalDate.now();
        Duration d2 = Duration.between(dataAdocao.atTime(0, 0), agora.atTime(0, 0));
        System.out.println("Dias em que esta adotado: " + d2.toDays() + " dias.");
    }


    public void imprime(){
        if(estaAdotado() == true){
            System.out.println("Adocao realizada com sucesso!");
            System.out.println("Nome do adotante: "+adotante.getNome());
            System.out.println("Email do adotante: "+adotante.getEmail());
            System.out.println("Especie: "+petAdotado.getEspecie());
            if(this.getPetAdotado().temRaca()){
                System.out.println("Raca: "+petAdotado.getRaca());
            }
            else{
                System.out.println("Sem raca.");
            }
            System.out.println("Pet adotado: "+petAdotado.getNome());
            petAdotado.nutrido();
            System.out.println("Data de adocao: "+dataAdocao);
            tempoNaOng();
            tempoAdotado();
        }
        else{
            System.out.println("Adocao negada! Este animal ainda nao deu entrada.");  
        }
    }
}