package academy.devdojo.maratonajava.javacore.exception.exceptiontest.test;
import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException{
        File file = new File("C:\\Users\\jose_\\OneDrive\\Área de Trabalho\\vscode\\JAVA\\atividades\\javinha\\arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        }catch(IOException e){
            e.printStackTrace();
            throw e; // Re-throwing the exception to indicate that an error occurred
        }
    }
}