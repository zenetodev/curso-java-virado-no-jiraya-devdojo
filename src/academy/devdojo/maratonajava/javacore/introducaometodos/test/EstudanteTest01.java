package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Goku";
        estudante01.idade = 30;
        estudante01.sexo = 'M';

        estudante02.nome = "Vegeta";
        estudante02.idade = 35;
        estudante02.sexo = 'M';

        impressoraEstudante.imprime(estudante01);
        System.out.println("-------------------------");
        impressoraEstudante.imprime(estudante02);
    }
    
}
