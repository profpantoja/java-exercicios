package Model;

import java.util.ArrayList;

public class Environment {

    private String fundo;
    private String chão;
    private float altura;
    private float largura;
    private int x;
    private int y;
    private ArrayList<Character> Character;
    private ArrayList<ObjectGame> Object;
    
    public Environment() {
    }

    public Environment(String fundo, String chão, float altura, float largura, int x, int y,
            ArrayList<Model.Character> character, ArrayList<Model.ObjectGame> object) {
        this.fundo = fundo;
        this.chão = chão;
        this.altura = altura;
        this.largura = largura;
        this.x = x;
        this.y = y;
        Character = character;
        Object = object;
    }

    public void colidiu(ArrayList<Character> p, ArrayList<ObjectGame> o){

        if((o.get(0).getX() >= p.get(0).getX() && o.get(0).getX() <= (p.get(0).getX()+p.get(0).getLargura()))){
            System.out.println("O sonic pegou uma moeda");
        }

    }

    public String getFundo() {
        return fundo;
    }
    public void setFundo(String fundo) {
        this.fundo = fundo;
    }
    public String getChão() {
        return chão;
    }
    public void setChão(String chão) {
        this.chão = chão;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public float getLargura() {
        return largura;
    }
    public void setLargura(int largura) {
        this.largura = largura;
    }
    public ArrayList<Character> getCharacter() {
        return Character;
    }
    public void setCharacter(ArrayList<Character> character) {
        Character = character;
    }
    public ArrayList<ObjectGame> getObject() {
        return Object;
    }
    public void setObject(ArrayList<ObjectGame> object) {
        Object = object;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
