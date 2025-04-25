package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;



public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.print("Digite o seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o seu endereço: ");
            String endereço = scanner.nextLine();

            System.out.print("Digite a data: ");
            String data = scanner.nextLine();

            System.out.print("Digite o seu salario: ");
            double salario = scanner.nextDouble();

            System.out.printf("Eu " + nome + " morando no endereço " + endereço + " confirmo que recebi o salário de R$ " + salario + " no dia " + data + "\n");
    
        } finally{
            scanner.close();
        }
    }
}
