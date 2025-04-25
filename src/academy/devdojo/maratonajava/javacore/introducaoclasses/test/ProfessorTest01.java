package academy.devdojo.maratonajava.javacore.introducaoclasses.test;
import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Antonio";
        professor.idade = 45;
        professor.sexo = 'M';
        professor.especialidade = "Matematica";
        professor.salario = 5000.00;
        professor.cpf = "123.456.789-00";
        System.out.println(professor.nome + " tem " + professor.idade + " anos e é do sexo " + professor.sexo);
        
    }
}
