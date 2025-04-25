package academy.devdojo.maratonajava.javacore.associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Dite M ou F para seu sexo");
        char sexo = scanner.next().charAt(0);

        System.out.println("----------");
        System.out.println("nome: "+ nome);
        System.out.println("idade: "+ idade);
        System.out.println("sexo: " + sexo);

        scanner.close();
    }
}
