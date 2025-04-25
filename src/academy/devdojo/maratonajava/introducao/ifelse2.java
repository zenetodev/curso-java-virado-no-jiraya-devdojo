package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        scanner.close();
        if (idade < 15) {
            System.out.println("Criança");
        } else if (idade >= 15 && idade <= 18) {
            System.out.println("Adolescente");
        } else if (idade <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        } 
    }
}
