public class Kate {

    private int energia;
    private int quantidadeVidas;
    private String poder;


    public Kate(String energia, int quantidadeVidas){
        this.energia = energia;
        this.quantidadeVidas = quantidadeVidas;

    }

    public String getEnergia(){
        return energia;
    }

    public void setEnergia(int energia){
        this.energia = energia;
    }

    public int getQuantidadeVidas(){
        return quantidadeVidas;
    }

    public void setQuantidadeVidas(int quantidadeVidas){
        this.quantidadeVidas = quantidadeVidas;
    }

    public String getPoder(){
        return poder;
    }

    public void setPoder(String poder){
        this.poder = poder;
    }


    public void pular(){

    }

    public void andar(){

    }

    public void utilizar_poder(){
        System.out.println("Utilizar poder SuperBark");
        System.out.println("Utilizar poder EyeBeam");
        System.out.println("Utilizar poder RearRocket");
    }

    public void tipo_poder(){
        if(poder == "EyeBeam"){
            energia(-20);
         } else{

            if(poder == "RearRocket"){
                energia(-50);

            }else{
                System.out.println("Personagem morreu");

            }

            }
            
        }

    }

        




    
    
}
