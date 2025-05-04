package academy.devdojo.maratonajava.javacore.exception.exceptiontest.dominio;

import java.io.FileNotFoundException;

public class Pessoa {
    
    public void salvar() throws LoginInvalidoException, FileNotFoundException{
        System.out.println("Salvando pessoa...");
        
    }
}
