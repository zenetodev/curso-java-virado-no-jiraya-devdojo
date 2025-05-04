package academy.devdojo.maratonajava.javacore.string.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(1000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para concatenar String: " + (fim - inicio) + "ms"); // String Utilizado para concatenar strings, mas não é recomendado para grandes tamanhos.

        inicio = System.currentTimeMillis();
        concatStringBuilder(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para concatenar StringBuilder: " + (fim - inicio) + "ms"); // StringBuilder é mais rápido que o StringBuffer, pois não é sincronizado, ou seja, não é thread-safe. Usado para concatenar strings em aplicações que não precisam de sincronização.

        inicio = System.currentTimeMillis();
        concatStringBuffer(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para concatenar StringBuffer: " + (fim - inicio) + "ms"); // StringBuffer é mais lento que o StringBuilder, pois é sincronizado, ou seja, é thread-safe. Usado para concatenar strings em aplicações que precisam de sincronização.
    }

    private static void concatString(int tamanho) {
        String texto = ""; // 1. String é imutável, então toda vez que concatenamos uma string, uma nova string é criada na memória.
        for (int i = 0; i < tamanho; i++) {
            texto += i; // 2. O operador += cria uma nova string a cada iteração, o que pode ser ineficiente para grandes tamanhos.
        }

    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho); 
        for (int i = 0; i < tamanho; i++) {
            sb.append(i); 
        }

    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}

