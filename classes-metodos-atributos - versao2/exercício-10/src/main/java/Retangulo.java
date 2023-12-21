public class Retangulo {

    double comprimento,largura;

    // Realizar o cálculo da área do retângulo

    public void area() {

        double area;
        area = this.largura * this.comprimento;
        System.out.println("Area do retângulo é : " + area);

    }

    public void perimetro() {
        perimetro = 2 * (this.largura + this.comprimento);
        System.out.println("Perímetro do retângulo é : " + perimetro);
    }
}
