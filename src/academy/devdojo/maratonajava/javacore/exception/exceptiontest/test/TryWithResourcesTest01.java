package academy.devdojo.maratonajava.javacore.exception.exceptiontest.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import academy.devdojo.maratonajava.javacore.exception.exceptiontest.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.exception.exceptiontest.dominio.Leitor2;
public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo(){
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()){
            // Lógica para ler o arquivo
        } catch (IOException e) {
            
        }
    }

    // O try-with-resources é uma estrutura de controle do Java que permite que você declare um ou mais recursos que devem ser fechados automaticamente após o uso. 




    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
