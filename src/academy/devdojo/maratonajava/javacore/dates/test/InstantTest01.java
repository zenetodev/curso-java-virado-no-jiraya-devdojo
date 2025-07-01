package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(LocalDateTime.now());
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000));
    }
}
