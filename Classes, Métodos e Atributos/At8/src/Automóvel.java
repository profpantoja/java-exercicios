public class Automóvel {
    
    private String marca;
    private String modelo;
    private int anofabril;
    private int anomodelo;
    private String cor;
    private double quilometragem;
    private double kmpercorrido;
    private double duracaocorridahora;
    private double duracaocorridaminutos;
    private double vm;


    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnofabril() {
        return anofabril;
    }
    public void setAnofabril(int anofabril) {
        this.anofabril = anofabril;
    }
    public int getAnomodelo() {
        return anomodelo;
    }
    public void setAnomodelo(int anomodelo) {
        this.anomodelo = anomodelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
   
    public double getKmpercorrido() {
        return kmpercorrido;
    }
    public void setKmpercorrido(double kmpercorrido) {
        this.kmpercorrido = kmpercorrido;
    }
   
    public double getVm() {
        return vm;
    }
    public void setVm(double vm) {
        this.vm = vm;
    }
    
    public double getDuracaocorridahora() {
        return duracaocorridahora;
    }
    public void setDuracaocorridahora(double duracaocorridahora) {
        this.duracaocorridahora = duracaocorridahora;
    }
    public double getDuracaocorridaminutos() {
        return duracaocorridaminutos;
    }
    public void setDuracaocorridaminutos(double duracaocorridaminutos) {
        this.duracaocorridaminutos = duracaocorridaminutos;
    }






    public void InfoCar(){

        System.out.println("Marca:"+getMarca());
        System.out.println("Modelo"+getModelo());
        System.out.println("Ano de fabricação"+getAnofabril());
        System.out.println("Ano do modelo:"+getAnomodelo());
        System.out.println("Cor:"+getCor());
        System.out.println(getQuilometragem()+" Km percorridos");
        System.out.println("--------------------/////-------------");


    }


    public void addkm(double add){
        setQuilometragem(getQuilometragem() + add);
        
    }

    public void vmedia(){
        vm= (getKmpercorrido()/(getDuracaocorridahora()+getDuracaocorridaminutos()/60));
        System.out.printf("a velocidade media é de %.2f Km/h \n \n", vm);
    }

    
    
    public void acelerar(){
        System.out.println("Acelerando");
    }
    public void frear(){
        System.out.println("Freando");
    }
    public void mvesquerda(){
        System.out.println("movendo para a esquerda");
    }
    public void mvdireita(){
        System.out.println("movendo para a direita");
    }



}
