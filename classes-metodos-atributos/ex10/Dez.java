package ex10;
public class Dez {

    public static void main(String[] args) {

        Retangulo r1 = new Retangulo();
        r1.setBase(10);
        r1.setAltura(20);
        System.out.println(r1.area());
        System.out.println(r1.perimetro());

        Retangulo r2 = new Retangulo();
        r2.setBase(5);
        r2.setAltura(10);
        System.out.println(r1.area());
        System.out.println(r1.perimetro());

        Retangulo r3 = new Retangulo();
        r3.setBase(20);
        r3.setAltura(40);
        System.out.println(r1.area());
        System.out.println(r1.perimetro());
    }

}
