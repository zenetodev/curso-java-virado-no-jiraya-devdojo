# Arrays Multidimensionais em Java

Um array multidimensional em Java é essencialmente um array de arrays. O tipo mais comum é o array bidimensional, que pode ser visualizado como uma tabela com linhas e colunas. A sintaxe básica para declarar um array bidimensional é a seguinte:

```java
tipo[][] nomeDoArray = new tipo[numeroDeLinhas][numeroDeColunas];
```

## Exemplo: Matriz de Números Inteiros

Neste exemplo, vamos criar e manipular uma matriz 3x3 de números inteiros.

```java
public class MatrizExemplo {
    public static void main(String[] args) {
        // Declaração e inicialização da matriz 3x3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Impressão dos elementos da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

**Explicação:**
1. **Declaração e inicialização da matriz:**
   - `int[][] matriz = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };`
   - Declara uma matriz de inteiros com 3 linhas e 3 colunas e a inicializa com valores específicos.

2. **Impressão dos elementos da matriz:**
   - Utilizamos dois laços `for` aninhados para percorrer a matriz.
   - O laço externo (`for (int i = 0; i < matriz.length; i++)`) percorre as linhas da matriz.
   - O laço interno (`for (int j = 0; j < matriz[i].length; j++)`) percorre as colunas da matriz.
   - `System.out.print(matriz[i][j] + " ");` imprime o elemento atual seguido de um espaço.
   - `System.out.println();` move para a próxima linha após imprimir todos os elementos de uma linha.

## Explicação dos Laços `for`

### Laço Externo

```java
for (int i = 0; i < matriz.length; i++) {
    // ...existing code...
}
```

- **Inicialização:** `int i = 0;` - Inicializa a variável `i` com 0, que será usada como índice para percorrer as linhas da matriz.
- **Condição:** `i < matriz.length;` - Verifica se `i` é menor que o número de linhas da matriz. `matriz.length` retorna o número total de linhas.
- **Incremento:** `i++` - Incrementa o valor de `i` em 1 após cada iteração.

### Laço Interno

```java
for (int j = 0; j < matriz[i].length; j++) {
    // ...existing code...
}
```

- **Inicialização:** `int j = 0;` - Inicializa a variável `j` com 0, que será usada como índice para percorrer as colunas da matriz.
- **Condição:** `j < matriz[i].length;` - Verifica se `j` é menor que o número de colunas da linha atual (`matriz[i]`). `matriz[i].length` retorna o número total de colunas na linha `i`.
- **Incremento:** `j++` - Incrementa o valor de `j` em 1 após cada iteração.

### Funcionamento Conjunto

- O laço externo percorre cada linha da matriz.
- Para cada linha, o laço interno percorre cada coluna.
- Desta forma, todos os elementos da matriz são acessados e impressos na ordem correta.
