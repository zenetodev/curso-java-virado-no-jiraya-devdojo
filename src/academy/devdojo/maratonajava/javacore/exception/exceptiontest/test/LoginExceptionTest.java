package academy.devdojo.maratonajava.javacore.exception.exceptiontest.test;

import java.util.Scanner;

import academy.devdojo.maratonajava.javacore.exception.exceptiontest.dominio.LoginInvalidoException;

public class LoginExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        String usernameDB = "Goku";
        String passwordDB = "ssj";
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite o username: ");
            String usernameDigitado = teclado.nextLine();
            System.out.println("Digite a senha: ");
            String passwordDigitada = teclado.nextLine();
            if (!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitada)) {
                throw new LoginInvalidoException("Usuário ou senha Inválidos!");
            }
            System.out.println("Usuário logado com sucesso!");
        }
    }
}
