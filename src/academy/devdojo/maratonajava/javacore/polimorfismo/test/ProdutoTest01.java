package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.javacore.polimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01{
    public static void main(String[] args) {
        Computador computador = new Computador("Acer", 4500);
        Tomate tomate = new Tomate("Tomate Siciliano", 5);
        Televisao tv = new Televisao("Samsung", 3000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}