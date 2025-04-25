package academy.devdojo.maratonajava.javacore.modificadorestatico.test;
import academy.devdojo.maratonajava.javacore.modificadorestatico.domain.Carro;
public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Bmw", 280);
        Carro c2 = new Carro("Fusca", 120);
        Carro c3 = new Carro("Civic", 200);
        Carro.setVelocidadeLimite(150); // Altera a velocidade limite para todos os carros
        

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
