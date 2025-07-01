package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Todos os caracteres que nao sao digitos
        // \s = Espaços em branco \t \n \r \f \r
        // \S = Todos os caracteres que nao sao espacos em branco
        // \w = a-z A-Z, digitos e _ (alfanumericos)
        // \W = Tudo o que não for incluso em \w
        // [] 
        // String regex = "[a-zA-Z]";
        String regex = "0[xX][0-9a-fA-F]+";
        // String text = "abaaba";
        String text2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("texto: " + text2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posicoes encontradas");
        while(matcher.find()) {
            System.out.print(matcher.start() + " "+ matcher.group() + "\n");
        }
        int numeroHex = 0x59f86A;
        System.out.println(numeroHex);
    }
}
