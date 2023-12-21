package main.java;

public class Quarto{

private boolean status; 
   

public boolean getStatus() {
    return status;
}

public void setStatus(boolean status) {
    this.status = status;
}


public void ligar(){
    status = true;
}


public void desligar(){
    status = false;
}

public String observar(){
    if(status == true)
       return "ligada";
   else
    return "desligada";
}
} 
