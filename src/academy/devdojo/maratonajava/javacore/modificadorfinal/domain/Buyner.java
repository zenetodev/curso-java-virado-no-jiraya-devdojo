package academy.devdojo.maratonajava.javacore.modificadorfinal.domain;

public class Buyner {
    private String name;

    
    @Override
    public String toString() {
        return "Buyner [name=" + name + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
