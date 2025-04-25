package academy.devdojo.maratonajava.javacore.classesabstratas.test;
import academy.devdojo.maratonajava.javacore.classesabstratas.domain.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.classesabstratas.domain.Gerente;
public class FuncionarioTest01 {
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("Luffy", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Toya", 12000);
        gerente.imprimeDados();
        desenvolvedor.imprimeDados();
    }
}
