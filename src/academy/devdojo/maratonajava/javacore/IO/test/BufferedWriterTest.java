package academy.devdojo.maratonajava.javacore.IO.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class BufferedWriterTest {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("O DevDojo é o melhor curso de Java");
            bw.newLine();
            bw.flush();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
