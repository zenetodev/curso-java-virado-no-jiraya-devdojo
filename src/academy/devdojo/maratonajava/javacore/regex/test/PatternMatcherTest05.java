package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Todos os caracteres que nao sao digitos
        // \s = Espaços em branco \t \n \r \f \r
        // \S = Todos os caracteres que nao sao espacos em branco
        // \w = a-z A-Z, digitos e _ (alfanumericos)
        // \W = Tudo o que não for incluso em \w
        // [] 
        // ? = 0 ou 1 vezes
        // * = 0 ou mais vezes
        // + = 1 ou mais vezes
        // {n, m} = n a m vezes
        // ( ) = grupo
        // | = ou
        // $ = final do texto
        // . = qualquer caractere
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com, sakura@mail";
        System.out.println("Email valido");
        System.out.println("zoro@mail.br".matches(regex));
        System.out.println((texto.split(",")[1]).trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
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
