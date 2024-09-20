public class Retangulo {
    
private double altura;
private double largura;


public double getAltura() {
    return altura;
}
public void setAltura(double altura) {
    this.altura = altura;
}
public double getLargura() {
    return largura;
}
public void setLargura(double largura) {
    this.largura = largura;
}


public void calcularPerimetro(){
    
    double perimetro = 2*(getLargura()+getAltura());
    System.out.println("O perimetro é "+ perimetro);
}


public void calcularArea(){
    
    double Area = (getLargura()*getAltura());
    System.out.println("A area é "+ Area);
}


}
