package academy.devdojo.maratonajava.javacore.exception.exceptiontest.test;

import java.io.FileNotFoundException;

import academy.devdojo.maratonajava.javacore.exception.exceptiontest.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.exception.exceptiontest.dominio.LoginInvalidoException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
