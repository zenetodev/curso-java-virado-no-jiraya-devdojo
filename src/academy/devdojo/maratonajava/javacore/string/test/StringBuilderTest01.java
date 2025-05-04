package academy.devdojo.maratonajava.javacore.string.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
    String nome = "Wiliiam Suane";
    nome.substring(0, 3); // String é imutável, não altera o valor da string, apenas cria uma nova string.
    nome.concat(" DevDojo"); // String é imutável, não altera o valor da string, apenas cria uma nova string.
    System.out.println(nome);
    StringBuilder sb = new StringBuilder("William Suane");
    sb.append(" DevDojo").append(" Academy"); // StringBuilder é mutável, altera o valor da string, não cria uma nova string.
    sb.reverse(); // Inverte a string, mas não altera o valor da string, apenas cria uma nova string.
    sb.reverse(); // Inverte a string, mas não altera o valor da string, apenas cria uma nova string.
    sb.substring(0, 2);
    sb.delete(0, 3);
    System.out.println(sb);
    }
}
