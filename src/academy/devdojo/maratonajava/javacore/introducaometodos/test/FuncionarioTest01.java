package academy.devdojo.maratonajava.javacore.introducaometodos.test;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;
public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Zeneto");
        funcionario.setIdade(30);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprime();

        System.out.println("Média: " + funcionario.getMedia());


    }  
}
