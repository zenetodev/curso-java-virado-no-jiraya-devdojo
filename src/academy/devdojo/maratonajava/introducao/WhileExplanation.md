# Laço `while` em Java

O laço `while` em Java é uma estrutura de controle que permite repetir um bloco de código enquanto uma condição booleana especificada for verdadeira. A sintaxe básica do `while` é a seguinte:

```java
while (condição) {
    // bloco de código a ser repetido
}
```

## Exemplo 1: Contagem regressiva

Neste exemplo, vamos usar um laço `while` para realizar uma contagem regressiva de 10 a 1.

```java
public class ContagemRegressiva {
    public static void main(String[] args) {
        int contador = 10;
        
        while (contador > 0) {
            System.out.println("Contagem: " + contador);
            contador--;
        }
        
        System.out.println("Fim da contagem regressiva!");
    }
}
```

**Explicação:**
- Inicializamos a variável `contador` com o valor 10.
- O laço `while` verifica se `contador` é maior que 0.
- Dentro do laço, imprimimos o valor atual de `contador` e, em seguida, decrementamos `contador` em 1.
- O laço continua até que `contador` seja igual a 0.
- Após o término do laço, imprimimos uma mensagem indicando o fim da contagem regressiva.

## Exemplo 2: Leitura de entrada do usuário

Neste exemplo, vamos usar um laço `while` para ler números inseridos pelo usuário até que ele insira um número negativo.

```java
import java.util.Scanner;

public class LeituraEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite um número (negativo para sair): ");
        numero = scanner.nextInt();
        
        while (numero >= 0) {
            System.out.println("Você digitou: " + numero);
            System.out.println("Digite outro número (negativo para sair): ");
            numero = scanner.nextInt();
        }
        
        System.out.println("Número negativo inserido. Programa encerrado.");
        scanner.close();
    }
}
```

**Explicação:**
- Criamos um objeto `Scanner` para ler a entrada do usuário.
- Inicializamos a variável `numero` com o valor inserido pelo usuário.
- O laço `while` verifica se `numero` é maior ou igual a 0.
- Dentro do laço, imprimimos o valor inserido e solicitamos outro número.
- O laço continua até que o usuário insira um número negativo.
- Após o término do laço, imprimimos uma mensagem indicando que o programa foi encerrado e fechamos o objeto `Scanner`.
