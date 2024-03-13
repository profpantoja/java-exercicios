public class Main {
    public static void main(String[] args) throws Exception {
        
        Retangulo retangulo1 = new Retangulo(12, 16);
        Retangulo retangulo2 = new Retangulo(2, 5);
        Retangulo retangulo3 = new Retangulo(2.8f, 4.7f);

        retangulo1.getArea();
        retangulo2.getArea();
        retangulo3.getArea();

        retangulo1.getPerimetro();
        retangulo2.getPerimetro();
        retangulo3.getPerimetro();

    }
}
