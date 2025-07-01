package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1988, Month.AUGUST, 6, 12,0, 0);
        LocalDateTime hoje = LocalDateTime.now();
        ChronoUnit.DAYS.between(aniversario, hoje);

        System.out.println(ChronoUnit.DAYS.between(aniversario, hoje));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, hoje));
        System.out.println(ChronoUnit.YEARS.between(aniversario, hoje));
        System.out.println(ChronoUnit.DECADES.between(aniversario, hoje));
        
    }
}
