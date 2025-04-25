package academy.devdojo.maratonajava.javacore.modificadorfinal.test;
import academy.devdojo.maratonajava.javacore.modificadorfinal.domain.Car;
public class CarroTest01 {
    public static void main(String[] args) {
        Car carro = new Car();
        System.out.println(Car.VELOCITY_LIMIT); // This line will cause a compilation error because VELOCITY_LIMIT is final and cannot be reassigned.
        System.out.println(carro.BUYNER);
        carro.BUYNER.setName("Kuririn");
        System.out.println(carro.BUYNER);
    }
}
