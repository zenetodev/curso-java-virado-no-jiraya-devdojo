package academy.devdojo.maratonajava.javacore.IO.test;

import java.io.File;
import java.io.FileReader;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)) {
//            char[] in = new char[100];
//            int readed = fr.read(in);
//            for (int i = 0; i < readed; i++) {
//                System.out.print(in[i]);
//            }
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
