public class Main {
    

    public static void main(String[] args) {
        
        Automóvel pace = new Automóvel();
        Automóvel mustang = new Automóvel();

        mustang.setMarca("Ford");
        mustang.setModelo("Mustang 5.0 V8 TI-VCT GASOLINA GT PREMIUM SELECTSHIFT");
        mustang.setAnofabril(2018);
        mustang.setAnomodelo(2018);
        mustang.setCor("Cinza");
        mustang.setQuilometragem(21.088);

        mustang.InfoCar();

        pace.setMarca("Jaguar");
        pace.setModelo("F-PACE 2.0 16V INGENIUM PRESTIGE AWD 4P AUTOMÁTICO");
        pace.setAnofabril(2018);
        pace.setAnomodelo(2017);
        pace.setCor("Cinza");
        pace.setQuilometragem(42.000);

        mustang.addkm(2.4);
        mustang.InfoCar();

        pace.InfoCar();

        mustang.setKmpercorrido(252);
        mustang.setDuracaocorridahora(2);
        mustang.setDuracaocorridaminutos(32);
        mustang.vmedia();
       

        pace.setKmpercorrido(42);
        pace.setDuracaocorridahora(0);
        pace.setDuracaocorridaminutos(35);
        pace.vmedia();

        mustang.acelerar();
        mustang.frear();
        mustang.mvdireita();
        mustang.mvesquerda();

    }
}
