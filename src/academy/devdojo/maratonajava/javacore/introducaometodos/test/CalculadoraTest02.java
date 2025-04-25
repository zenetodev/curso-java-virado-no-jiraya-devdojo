package academy.devdojo.maratonajava.javacore.introducaometodos.test;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 10;
        int num2 = 20;
        calculadora.multiplicaDoisNumeros(num1, num2);
        System.out.println("-------------------------");
        System.out.println("Fim do programa");
    }
    
}
