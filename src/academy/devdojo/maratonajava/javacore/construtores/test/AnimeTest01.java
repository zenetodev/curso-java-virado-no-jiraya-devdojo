package academy.devdojo.maratonajava.javacore.construtores.test;

import academy.devdojo.maratonajava.javacore.construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", 500, "TV", "ação, aventura", "Studio Pierrot");
        anime.imprime();     
    }
}
