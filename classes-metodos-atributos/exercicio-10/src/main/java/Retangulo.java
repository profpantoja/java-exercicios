package main.Java;

public class Retangulo {
    
    private float altura;
    private float largura;

    public Retangulo() {

    }

    public Retangulo(float altura, float largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public void getArea() {
        float area = altura * largura;
        System.out.println("Area do retangulo: " + area);
    }

    public void getPerimetro() {
        float perimetro = (altura*2) + (largura*2);
        System.out.println("Perimetro do retangulo: " + perimetro); 
    }

}
