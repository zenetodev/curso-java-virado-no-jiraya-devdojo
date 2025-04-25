package academy.devdojo.maratonajava.javacore.associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("O grande software de previsao do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou nao.");

        String pergunta = scanner.nextLine();

        if(pergunta.charAt(0) == ' '){
            System.out.println("Sim");
        }else{
            System.out.println("Nao.");
        }
        
        scanner.close();
    }
}
