package academy.devdojo.maratonajava.javacore.exercicio.test;

import academy.devdojo.maratonajava.javacore.exercicio.domain.Local;
import academy.devdojo.maratonajava.javacore.exercicio.domain.Aluno;
import academy.devdojo.maratonajava.javacore.exercicio.domain.Professor;
import academy.devdojo.maratonajava.javacore.exercicio.domain.Seminario;
public class SistemaTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Flores, 123");
        Aluno aluno1 = new Aluno("Joaozin", 15);
        Professor professor = new Professor("Carlos", "Matematica");
        Aluno[] alunosParaSeminario = {aluno1};
        Seminario seminario = new Seminario("Matematica Avancada", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
