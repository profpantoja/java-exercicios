public class main {
        public static void main(String[] args) {
            
            ContaCorrente CC1 = new ContaCorrente(2800.87, 44448, "Wagnner Wayne", 2500.00,"ATIVA");


            CC1.infos();

            CC1.depositar(2550.66);
            CC1.levantar(4000.99);
            CC1.transferir(1500, 444449);
            
            CC1.infos();
            
        }


}
