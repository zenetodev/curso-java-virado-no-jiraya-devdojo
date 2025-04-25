package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class MenuSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMENU DO SISTEMA:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Transferir dinheiro");
            System.out.println("3 - Pagar boleto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é de R$ 1.000,00.");
                    break;
                case 2:
                    System.out.println("Digite os dados para transferência.");
                    break;
                case 3:
                    System.out.println("Pagamento realizado com sucesso.");
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
