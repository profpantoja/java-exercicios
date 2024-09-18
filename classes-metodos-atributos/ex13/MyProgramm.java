package ex13;

public class MyProgramm {  
    public static void main(String[] args) {
        Quarto quarto = new Quarto();
        quarto.getLampada().ligar();
        quarto.getVentiladores().get(0).alterarVelocidade(1);
        quarto.getVentiladores().get(1).alterarVelocidade(2);
        quarto.getVentiladores().get(2).alterarVelocidade(3);
        quarto.ExibirStatus();
        
        
        
    }

    
}
