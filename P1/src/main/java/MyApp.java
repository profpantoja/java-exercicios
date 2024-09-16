import java.util.ArrayList;

import Model.Character;
import Model.Environment;
import Model.ObjectGame;
import Model.Sonic;
import Model.Monkey;
import Model.Tails;

public class MyApp {
    
    public static void main(String args[]){

    Character personagem_teste = new Character("Personagem teste","Não especificado","Não especificada",2,1,0,0,0,0);
    Sonic sonic = new Sonic("Sonic","Ouriço do mar","Azul",2,1,5,3,3,0);
    Tails tails = new Tails("Tails","Raposa","Laranja",2,1,3,3,3,0);
    Monkey monkey = new Monkey("Monkey","Macaco","Marrom",2,1,8,6,1);

    ArrayList<Character> personagens = new ArrayList<Character>();
    personagens.add(sonic);
    personagens.add(tails);
    personagens.add(monkey);

    ObjectGame ring1 = new ObjectGame("Moeda","Ouro",1,1,6,6);
    ObjectGame ring2 = new ObjectGame("Moeda","Ouro",1,1,7,6);
    ObjectGame ring3 = new ObjectGame("Moeda","Ouro",1,1,8,6);
    ObjectGame box = new ObjectGame("Caixa","Madeira");

    ArrayList<ObjectGame> objetos = new ArrayList<ObjectGame>();
    objetos.add(ring1);
    objetos.add(ring2);
    objetos.add(ring3);
    objetos.add(box);

    Environment HillTopZone = new Environment("Ceú com nuvens, mar e arvorés","Terra e mato",13, 11, 10, 12, personagens, objetos);

    System.out.println("O personagem está na posiçao ("+personagem_teste.getX()+","+personagem_teste.getY()+")");
    personagem_teste.mover("frente",personagem_teste);
    personagem_teste.mover("tras",personagem_teste);
    personagem_teste.mover("baixo",personagem_teste);
    personagem_teste.mover("cima",personagem_teste);

    System.out.println("\nO Sonic está na posiçao ("+sonic.getX()+","+sonic.getY()+")");
    // ao pular o sonic pega uma ring
    sonic.mover("pular",sonic);

    System.out.println("\nO Tails está na posiçao ("+tails.getX()+","+tails.getY()+")");
    tails.mover("voar",tails);

    System.out.println("\nO Monkey está na posiçao ("+monkey.getX()+","+monkey.getY()+")");
    monkey.mover("subir",monkey);

    System.out.println("\nMovendo o Tails até a ring e depois ate o sonic");
    tails.mover("frente",tails);
    tails.mover("frente",tails);
    tails.mover("baixo",tails);
    tails.mover("baixo",tails);
    
    }

}
