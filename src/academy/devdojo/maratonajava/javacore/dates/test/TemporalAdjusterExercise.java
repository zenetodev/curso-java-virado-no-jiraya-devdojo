package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import academy.devdojo.maratonajava.javacore.exercicio.domain.Local;

import java.time.temporal.TemporalAdjuster;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

class ObterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays = 1;
        switch (dayOfWeek) {
            case THURSDAY:
            addDays = 4;
            break;
            case FRIDAY: 
                addDays =3; 
                break;
            case SATURDAY: 
                addDays = 2; 
                break;
            default: 
                addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}
public class TemporalAdjusterExercise {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        now = LocalDate.now().withDayOfMonth(1).with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(20).with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    
    }
}
