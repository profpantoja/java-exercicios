import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FichaAdocao {

    private Pet pet;
    private Pessoa guardiao;
    private LocalDate checkout;

    public FichaAdocao() {
        this.pet = null;
        this.guardiao = null;
        this.checkout = null;
    }

    public FichaAdocao(Pet pet, Pessoa guardiao, LocalDate checkout) {
        if((pet.getCheckin().isBefore(checkout)) && !pet.isAdopted()){
            this.pet = pet;
            this.guardiao = guardiao;
            this.checkout = checkout;
            this.pet.setAdopted(true);
            System.out.println("Animal adotado com sucesso! Parabéns Pai/Mãe de pet!!!");
        }
        else System.out.println("Adoção inválida.");
    }

    public void alterarDono(Pessoa guardiao){
        if(this.pet.isAdopted() && this.guardiao.equals(guardiao)){
            System.out.println("Operação de troca de dono inválida.");
        }
        else {
            this.guardiao = guardiao;
            this.checkout = LocalDate.now();
            System.out.println("Troca de dono efetuada com sucesso.");
        }
    }

    public int tempoAdotado(){
        long days = ChronoUnit.DAYS.between(this.checkout, LocalDate.now());
        return ((int)days);
    }

    public int tempoClinica(){
        long days = ChronoUnit.DAYS.between(this.pet.getCheckin(), this.checkout);
        return ((int)days);
    }

    public boolean contains(String nome){
        boolean answer;
        if(nome.equals(this.getPet().getName())) answer = true;
        else answer = false;

        return answer;
    }

    public Pet getPet() { return pet; }
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pessoa getGuardiao() { return guardiao; }
    public void setGuardiao(Pessoa guardiao) {
        this.guardiao = guardiao;
    }

    public LocalDate getcheckout() { return checkout; }
    public void setcheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "FichaAdocao [pet=" + pet + ", guardiao=" + guardiao + ", checkout=" + checkout + "]";
    }

}
