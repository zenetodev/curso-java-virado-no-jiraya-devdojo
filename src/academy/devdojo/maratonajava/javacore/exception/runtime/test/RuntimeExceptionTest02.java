package academy.devdojo.maratonajava.javacore.exception.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) throws IOException{
        divisao(1,0);
        
        System.out.println("Código finalizado");
    }

    private static int divisao(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Argumento inválido, não é possível dividir por zero");
        }
        return a/b;
    }
}
