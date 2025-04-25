package academy.devdojo.maratonajava.javacore.sobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dungeon ni deai", "TV", 12, "ação, romance"); 
        anime.imprime();     
    }
}
