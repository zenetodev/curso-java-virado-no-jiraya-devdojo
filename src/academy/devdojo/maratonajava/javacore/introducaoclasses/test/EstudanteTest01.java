package academy.devdojo.maratonajava.javacore.introducaoclasses.test;
import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); 
        estudante.nome = "zeneto";
        estudante.idade = 22;
        estudante.sexo = 'M';
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);    

       
            
        }
    }


