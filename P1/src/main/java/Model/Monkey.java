package Model;

public class Monkey extends Character{

    public Monkey(String nome, String tipo_animal, String cor, float altura, float largura, int x, int y,int qtd_vidas) {
        super(nome,tipo_animal,cor,altura,largura,x,y,qtd_vidas);
    }

    public void mover(String movimento, Character monkey){
        int calc;
            
            switch(movimento){
                case "frente":
                    calc = monkey.getX() + 1;
                    monkey.setX(calc);
                    System.out.println("O "+monkey.getNome()+" se moveu para frente, sua nova posiçao é: ("+monkey.getX()+","+monkey.getY()+")");
                    break;
                case "tras":
                    if(monkey.getX() != 0) {
                        calc = monkey.getX() - 1;
                        monkey.setX(calc);
                        System.out.println("O "+monkey.getNome()+" se moveu para trás, sua nova posiçao é: ("+monkey.getX()+","+monkey.getY()+")");
                        break;
                    }
                    else{
                        System.out.println("Nao é possível movimentar o "+monkey.getNome()+ " para trás, sua posiçao é: ("+monkey.getX()+","+monkey.getY()+")");
                        break;
                    }
                case "baixo":
                    if(monkey.getY() != 0) {
                        calc = monkey.getY() - 1;
                        monkey.setY(calc);
                        System.out.println("O "+monkey.getNome()+" se moveu para baixo, sua nova posiçao é: ("+monkey.getX()+","+monkey.getY()+")");
                        break;
                    }
                    else{
                        System.out.println("Nao é possível movimentar o "+monkey.getNome()+ " para baixo, sua posiçao é: ("+monkey.getX()+","+monkey.getY()+")");
                        break;
                    }
                case "subir":
                    calc = monkey.getY() + 2;
                    monkey.setY(calc);
                    System.out.println("O "+monkey.getNome()+" subiu a arvoré, sua nova posiçao é: ("+monkey.getX()+","+monkey.getY()+")");
                    break;
                default:
                    System.out.println("Movimento nao reconhecido!");
                    break;
            }
    
        }
    
}
