package academy.devdojo.maratonajava.introducao;

public class Operadorternario {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar R$500,00";
        String mensagemNaoDoar = "Eu não vou doar";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
       
    }
}
