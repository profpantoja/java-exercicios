public class MyProgram {

    public static void main(String[] args) {

        int estado = 0;

      Temperatura temperatura = new Temperatura();

      if (estado == 0)
            temperatura.alta();
        else
        temperatura.baixa();



        Abajour acao = new Abajour();

        estado = JOptionPane.showConfirmDialog(null, "Ligar o abajour");

       
        if (estado == 0)
            acao.ligar();
        else
            acao.desligar();


        Ventilador acao = new Ventilador();

        estado = JOptionPane.showConfirmDialog(null, "Ligar o ventilador");

       
        if (estado == 0)
            acao.ligar();
        else
            acao.desligar();

    

        Lampada acao = new Lampada();

        estado = JOptionPane.showConfirmDialog(null, "Ligar a lâmpada");

       
        if (estado == 0)
            acao.ligar();
        else
            acao.desligar();

    }

}
