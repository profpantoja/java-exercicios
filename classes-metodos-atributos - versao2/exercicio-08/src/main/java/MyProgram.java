public class MyProgram {

    public static void main (String [] args){

        Automovel automovel1 = new Automovel();
        automovel1.setModelo("Up");
        automovel1.setFabricante("Volkswagen");
        automovel1.setPlaca("JKL6747");
        automovel1.setCor("prata");
        automovel1.setNumRenavan(144003058);

        Automovel automovel2 = new Automovel();
        automovel2.setModelo("Jaguar");
        automovel2.setFabricante("Tata Motors");
        automovel2.setPlaca("BXW8847");
        automovel2.setCor("vermelho");
        automovel2.setNumRenavan(789013058);

        System.out.println(automovel1.getModelo() + " " + automovel1.getFabricante()+ " " + automovel1.getCor() + " " + automovel1.getPlaca()+ " " + automovel1.getNumRenavan());
        System.out.println(automovel2.getModelo() + " " + automovel2.getFabricante()+ " " + automovel2.getCor() + " " + automovel2.getPlaca()+ " " + automovel2.getNumRenavan());


    }
    
}
