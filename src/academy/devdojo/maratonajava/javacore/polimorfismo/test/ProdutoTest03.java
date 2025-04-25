package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Acerzinho", 4100);
        Tomate tomate = new Tomate("Tomate", 10);
        tomate.setDataValidade("11/12/2025");

        CalculadoraImposto.calcularImposto(tomate);
    }
}
