package academy.devdojo.maratonajava.javacore.exception.exceptiontest.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login inválido: ");
    }
    
    public LoginInvalidoException(String message) {
        super(message);
    }
}
