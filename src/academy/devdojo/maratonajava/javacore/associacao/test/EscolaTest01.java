package academy.devdojo.maratonajava.javacore.associacao.test;
import academy.devdojo.maratonajava.javacore.associacao.domain.Escola;
import academy.devdojo.maratonajava.javacore.associacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        
        Professor professor1 = new Professor("Gustavo");
        Professor professor2 = new Professor("Antonio");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Adalto", professores);

        escola.imprime();
    }
}
