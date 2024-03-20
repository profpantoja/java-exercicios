package pantojava.lista02.ex01.src.main.java;

public class Contato {
    private String telefone;
    private String email;

    public Contato() {
        this.telefone = null;
        this.email = null;
    }
    
    public Contato(String telefone, String email) {
        this.telefone = telefone;
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
    
}
