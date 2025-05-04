package academy.devdojo.maratonajava.javacore.dates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH)); // Dia do mês
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); // Dia da semana
        System.out.println(c.get(Calendar.DAY_OF_YEAR)); // Dia do ano
        System.out.println(c.get(Calendar.WEEK_OF_MONTH)); // Semana do mês
        System.out.println(c.get(Calendar.WEEK_OF_YEAR)); // Semana do ano

        c.add(Calendar.DAY_OF_MONTH, 2);
        c.add(Calendar.HOUR, 2);
        Date date = c.getTime();
        System.out.println(c);
    }
}
