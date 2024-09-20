import java.util.ArrayList;

public class Kate {
    private int vida;
    private ArrayList<Poderes> poder;

    public Kate() {
    }

    public Kate(int vida) {
        this.vida = vida;
        this.poder = new ArrayList<>();
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public ArrayList<Poderes> getPoder() {
        return poder;
    }

    public void setPoder(ArrayList<Poderes> poder) {
        this.poder = poder;
    }

    public void addPoder(Poderes poderAdd){
        this.poder.add(poderAdd);
    }

    public void andar(){
        System.out.println("Kate andou pelo cenario!");
    }

    public void pular(){
        System.out.println("Kate pulou um obstaculo!");
    }

    public void utilizarPoder(String poderDesejado, Inimigos inimigo){
        boolean poderEncontrado = false;
        for(Poderes i: poder){
            if(i.getNome().equals(poderDesejado)){
                System.out.println("Kate utilizou o poder "+i.getNome());
                danoCausado(i, inimigo);
                poderEncontrado = true;
                break;
            }
        }
        if(poderEncontrado == false){
            System.out.println("Esse poder nao existe, ou kate ainda nao o conquistou!");
        }
    }

    public void danoCausado(Poderes poderUtilizado, Inimigos inimigoDesejado ){
        int energiaAtualInimigo = inimigoDesejado.getEnergia();
        int danoCausadoPoder = poderUtilizado.getDano();
        
        energiaAtualInimigo = energiaAtualInimigo-danoCausadoPoder;
        if(energiaAtualInimigo <=0){
            System.out.println("Kate causou "+danoCausadoPoder+ " ao inimigo." );
            System.out.println("Inimigo derrotado!");
        }
        else{
            System.out.println("Kate causou "+danoCausadoPoder+" ao inimigo.");
            System.out.println("Energia restante do inimigo: "+energiaAtualInimigo);
        }
    }
}
