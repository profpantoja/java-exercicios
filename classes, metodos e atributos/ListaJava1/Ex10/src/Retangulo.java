public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(){

    }

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getPerimetro(){
        return 2 * (this.base + this.altura);
    }

    public double getArea(){
        return this.base * this.altura;
    }

    public void imprime(){
        System.out.println("Perimetro: " + getPerimetro());
        System.out.println("Area: " + getArea());
    }
}
