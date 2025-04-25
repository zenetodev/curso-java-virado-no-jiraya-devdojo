package academy.devdojo.maratonajava.introducao;

public class Arrays3{
    public static void main(String[] args) {
        int [] numeros = {3, 7, 2, 9, 5};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
            System.out.println("A soma dos números: " + soma);
        }
        
        
    }
}

    

