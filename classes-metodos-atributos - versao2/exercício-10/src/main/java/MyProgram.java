package main.java;

public class MyProgram {

public static void main(String[]args){

    Retangulo retangulo1 = new Retangulo();
    retangulo1.comprimento = 15;
    retangulo1.largura = 5;
    
    System.out.println("Largura:" + retangulo1.largura);
    System.out.println("Comprimento:" + retangulo1.comprimento);
    retangulo1.area();
    retangulo1.perimetro();

    Retangulo retangulo2 = new Retangulo();
    retangulo2.comprimento = 10;
    retangulo2.largura = 3;

    System.out.println("Largura:" + retangulo2.largura);
    System.out.println("Comprimento:" + retangulo2.comprimento);
    retangulo2.area();
    retangulo2.perimetro();


    Retangulo retangulo3 = new Retangulo();
    retangulo3.comprimento = 20;
    retangulo3.largura = 10;

    System.out.println("Largura:" + retangulo3.largura);
    System.out.println("Comprimento:" + retangulo3.comprimento);
    retangulo3.area();
    retangulo3.perimetro();








}

}
        
        