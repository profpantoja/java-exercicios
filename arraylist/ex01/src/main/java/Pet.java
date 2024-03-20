import java.time.LocalDate;

public class Pet {
    private String name;
    private String race;
    private String species;
    private LocalDate checkin;
    private String color;
    private double weight;
    private boolean isAdopted;

    public Pet(){
        this.name = null;
        this.race = null;
        this.species = null;
        this.checkin = null;
        this.color = null;
        this.weight = 0.0;
        this.isAdopted = false;
    }

    public Pet(String name, String race, String species, LocalDate checkin, String color, double weight){
        this.name = name;
        this.race = race;
        this.species = species;
        this.checkin = checkin;
        this.color = color;
        this.weight = weight;
    }

    public String getNutricao(){
        String answer = new String();
        if(this.getWeight() <= 20 && this.getWeight() >= 0)
            answer = "Desnutrido";
        if(this.getWeight() <= 30 && this.getWeight() >= 21)
            answer = "Normal";
        if(this.getWeight() > 30)
            answer = "Obeso";

        return answer;
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public String getRace() { return race; }
    public void setRace(String race) {
        this.race = race;
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) {
        this.species = species;
    }

    public LocalDate getCheckin() { return checkin; }
    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;

    }

    public String getColor() { return color; }
    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() { return weight; }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isAdopted() { return isAdopted; }
    public void setAdopted(boolean isAdopted) {
        this.isAdopted = isAdopted;
    }

    @Override
    public String toString() {
        return "Pet [name=" + name + ", race=" + race + ", species=" + species + ", checkin=" + checkin + ", weight="
                + weight + "]";
    }

}
