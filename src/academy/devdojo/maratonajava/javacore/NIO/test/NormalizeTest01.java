package academy.devdojo.maratonajava.javacore.NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "C:\\Users\\jose_\\OneDrive\\Área de Trabalho\\vscode\\JAVA\\atividades\\javinha\\home\\zeneto\\dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1.normalize());
        Path path2 = Paths.get(diretorioProjeto, arquivoTxt);
    }
}
