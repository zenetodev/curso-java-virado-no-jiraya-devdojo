package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;


public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        

        estudante01.nome = "Goku";
        estudante01.idade = 30;
        estudante01.sexo = 'M';

        estudante02.nome = "Vegeta";
        estudante02.idade = 35;
        estudante02.sexo = 'M';

        estudante01.imprime();
        System.out.println("-------------------------");
        estudante02.imprime();
    }
}