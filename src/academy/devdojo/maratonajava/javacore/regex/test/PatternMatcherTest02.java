package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Todos os caracteres que nao sao digitos
        // \s = Espaços em branco \t \n \r \f \r
        // \S = Todos os caracteres que nao sao espacos em branco
        // \w = a-z A-Z, digitos e _ (alfanumericos)
        // \W = Tudo o que não for incluso em \w

        String regex = "\\S";
        // String text = "abaaba";
        String text2 = "asd1h2h312h3hsaddh1234";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("texto: " + text2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posicoes encontradas");
        while(matcher.find()) {
            System.out.print(matcher.start() + " "+ matcher.group() + "\n");
        }
    }
}
