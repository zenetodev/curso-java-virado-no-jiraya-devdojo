package academy.devdojo.maratonajava.javacore.herança.test;
import academy.devdojo.maratonajava.javacore.herança.domain.Funcionario;
public class HerancaTest02 {

    // 0 - Bloco de inicialização estático da superclasse é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe filha
    // 2 - Alocado espaço em memória pro objeto da superclasse
    // 3 - Cada atributo de superclasse é criado e inicializado com valores padrão (null, 0, false...) ou que foi passado da classe pai
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece na classe
    // 5 - Construtor da superclasse é executado
    // 6 - Alocado espaço em memória pro objeto da subclasse
    // 7 - Cada atributo de subclasse é criado e inicializado com valores padrão (null, 0, false...) 
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece na classe
    // 9 - Construtor da subclasse é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Antonio");
        System.out.println(funcionario);
    }
}
