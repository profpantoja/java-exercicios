
public class Main {
    
    public static void main(String[] args) {

        Lion leão = new Lion();
        Ornitorrinco orni = new Ornitorrinco();
        Eagle eagle = new Eagle();
        Dog dog = new Dog();
       

        leão.respirar();
        orni.respirar();
        eagle.respirar();
        dog.respirar();

        orni.dormir();
        eagle.comer();
        dog.andar();

        dog.latir();
        eagle.voar();
        
    }
}
