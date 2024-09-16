package Model;

public class Sonic extends Character{

    public Sonic(String nome, String tipo_animal, String cor, float altura, float largura, int x, int y,int qtd_vidas, int qtd_moedas) {
        super(nome,tipo_animal,cor,altura,largura,x,y,qtd_vidas,qtd_moedas);
    }

    public void mover(String movimento, Character sonic){
        int calc;
            
            switch(movimento){
                case "frente":
                    calc = sonic.getX() + 1;
                    sonic.setX(calc);
                    System.out.println("O "+sonic.getNome()+" se moveu para frente, sua nova posiçao é: ("+sonic.getX()+","+sonic.getY()+")");
                    break;
                case "tras":
                    if(sonic.getX() != 0) {
                        calc = sonic.getX() - 1;
                        sonic.setX(calc);
                        System.out.println("O "+sonic.getNome()+" se moveu para trás, sua nova posiçao é: ("+sonic.getX()+","+sonic.getY()+")");
                        break;
                    }
                    else{
                        System.out.println("Nao é possível movimentar o "+sonic.getNome()+ " para trás, sua posiçao é: ("+sonic.getX()+","+sonic.getY()+")");
                        break;
                    }
                case "baixo":
                    if(sonic.getY() != 0) {
                        calc = sonic.getY() - 1;
                        sonic.setY(calc);
                        System.out.println("O "+sonic.getNome()+" se moveu para baixo, sua nova posiçao é: ("+sonic.getX()+","+sonic.getY()+")");
                        break;
                    }
                    else{
                        System.out.println("Nao é possível movimentar o "+sonic.getNome()+ " para baixo, sua posiçao é: ("+sonic.getX()+","+sonic.getY()+")");
                        break;
                    }
                case "pular":
                    calc = sonic.getY() + 2;
                    sonic.setY(calc);
                    System.out.println("O "+sonic.getNome()+" pulou, posiçao max atingida no pulo: ("+sonic.getX()+","+sonic.getY()+")");
                    calc = sonic.getY() - 2;
                    sonic.setY(calc);
                    break;
                default:
                    System.out.println("Movimento nao reconhecido!");
                    break;
            }
    
        }
    
}
