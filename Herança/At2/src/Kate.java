class Kate extends Personagem {
    private int vidas;
    private String[] poderes;
    private int indicePoderAtual;

    public Kate() {
        super();
        this.vidas = 3;
        this.poderes = new String[4];
        this.indicePoderAtual = 0;
        poderes[0] = "SuperBark";
    }

    public void trocarPoder(int indice) {
        if (indice >= 0 && indice < poderes.length && poderes[indice] != null) {
            indicePoderAtual = indice;
            System.out.println("Kate trocou de poder para: " + poderes[indicePoderAtual]);
        }
    }

    public void usarPoder() {
        System.out.println("Kate usou: " + poderes[indicePoderAtual]);
    }

    public void adicionarPoder(String poder) {
        for (int i = 0; i < poderes.length; i++) {
            if (poderes[i] == null) {
                poderes[i] = poder;
                break;
            }
        }
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public String[] getPoderes() {
        return poderes;
    }

    public void setPoderes(String[] poderes) {
        this.poderes = poderes;
    }

    public int getIndicePoderAtual() {
        return indicePoderAtual;
    }

    public void setIndicePoderAtual(int indicePoderAtual) {
        this.indicePoderAtual = indicePoderAtual;
    }


    

}