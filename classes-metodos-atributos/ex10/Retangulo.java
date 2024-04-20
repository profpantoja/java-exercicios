package ex10;
public class Retangulo {
    private int base;
    private int altura;


    public int area(){
        
        return base * altura;
    }
    public int perimetro(){

        return base + base + altura + altura;
    }   
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAlura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    
}
