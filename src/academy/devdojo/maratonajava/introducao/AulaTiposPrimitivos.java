package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;
// SCANNER É UTILIZADO COMO SE FOSSE O INPUT EM PYTHON

public class AulaTiposPrimitivos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        try{

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("DIgite a sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        

        double imc = peso / (altura * altura);
        System.out.printf("IMC: %.2f\n", imc);
        } finally{
            scanner.close();
        }

    }           
}
