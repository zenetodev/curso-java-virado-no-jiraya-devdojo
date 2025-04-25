package academy.devdojo.maratonajava.introducao;

public class Repeticao01 {
    public static void main(String[] args) {
        // while, do while, for e for each

        int count = 0;
        while(count <= 10){
            System.out.println("Contador: " + count);
            count++;

        }
        do{
            System.out.println("Contador: " + count);
            count++;
        } while(count <= 10);

        count = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Contador: " + i);
        }

    }
}