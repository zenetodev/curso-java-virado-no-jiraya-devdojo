package academy.devdojo.maratonajava.javacore.modificadorfinal.domain;

public class Car {
    private String name;
    public static final double VELOCITY_LIMIT = 250;
    public final Buyner BUYNER = new Buyner();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static double getVelocityLimit() {
        return VELOCITY_LIMIT;
    }
    public Buyner getBUYNER() {
        return BUYNER;
    }
    

    
}
