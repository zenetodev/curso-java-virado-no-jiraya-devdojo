package academy.devdojo.maratonajava.javacore.NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\jose_\\OneDrive\\Área de Trabalho\\vscode\\JAVA\\atividades\\javinha\\file.txt");
        System.out.println(p1.getFileName().toFile().toPath());
    }
}
