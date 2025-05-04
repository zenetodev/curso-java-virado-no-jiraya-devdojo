package academy.devdojo.maratonajava.javacore.string.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William";
        String nome2 = "William";
        nome.concat(" Suane"); // nome += " Suane"; // String é imutável, não altera o valor da string, apenas cria uma nova string.
        System.out.println(nome); // William
        System.out.println(nome == nome2);
        String nome3 = new String("William"); // 1 variavel de referencia, 2 objeto do tipo string, 3 uma string no pool de string.
        System.out.println(nome2 == nome3);
        System.out.println(nome3.intern());

    }
}
