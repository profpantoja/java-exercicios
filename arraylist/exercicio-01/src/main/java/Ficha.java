public class Ficha {
    
    private String data;
    private Pessoa pessoa;
    private Animal animal;
    
    public Ficha() {
        
    }

    public Ficha(String data, Pessoa pessoa, Animal animal) {
        this.data = data;
        this.pessoa = pessoa;
        this.animal = animal;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

}
