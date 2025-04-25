package academy.devdojo.maratonajava.javacore.interfaces.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    default void checkPermission(){
        System.out.println("Check permission...");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do método estático, o tamanho máximo de dados é: " + MAX_DATA_SIZE);
    }
}
