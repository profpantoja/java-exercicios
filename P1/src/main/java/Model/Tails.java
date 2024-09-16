package Model;

public class Tails extends Character{

    public Tails(String nome, String tipo_animal, String cor, float altura, float largura, int x, int y,int qtd_vidas, int qtd_moedas) {
        super(nome,tipo_animal,cor,altura,largura,x,y,qtd_vidas,qtd_moedas);
    }

    public void mover(String movimento, Character tails){
        int calc;
            
            switch(movimento){
                case "frente":
                    calc = tails.getX() + 1;
                    tails.setX(calc);
                    System.out.println("O "+tails.getNome()+" se moveu para frente, sua nova posiçao é: ("+tails.getX()+","+tails.getY()+")");
                    break;
                case "tras":
                    if(tails.getX() != 0) {
                        calc = tails.getX() - 1;
                        tails.setX(calc);
                        System.out.println("O "+tails.getNome()+" se moveu para trás, sua nova posiçao é: ("+tails.getX()+","+tails.getY()+")");
                        break;
                    }
                    else{
                        System.out.println("Nao é possível movimentar o "+tails.getNome()+ "para trás, sua posiçao é: ("+tails.getX()+","+tails.getY()+")");
                        break;
                    }
                case "baixo":
                    if(tails.getY() != 0) {
                        calc = tails.getY() - 1;
                        tails.setY(calc);
                        System.out.println("O "+tails.getNome()+" se moveu para baixo, sua nova posiçao é: ("+tails.getX()+","+tails.getY()+")");
                        break;
                    }
                    else{
                        System.out.println("Nao é possível movimentar o "+tails.getNome()+ " para baixo, sua posiçao é: ("+tails.getX()+","+tails.getY()+")");
                        break;
                    }
                case "voar":
                    calc = tails.getY() + 2;
                    tails.setY(calc);
                    System.out.println("O "+tails.getNome()+" está voando, sua nova posiçao é: ("+tails.getX()+","+tails.getY()+")");
                    break;
                default:
                    System.out.println("Movimento nao reconhecido!");
                    break;
            }
    
        }
    
}
