public class Bhaskara {
    
    public double getDelta(double b, double a, double c){
        return (b * b - 4 * a * c);
    }

    public double getRaizX1(double a, double b, double delta){
        return ((b + Math.sqrt(delta)) / 2 * a);
    }

    public double getRaizX2(double a, double b, double delta){
        return ((b - Math.sqrt(delta)) / 2 * a);
    }

}
