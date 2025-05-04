package academy.devdojo.maratonajava.javacore.dates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1746400814707L);
        date.setTime(date.getTime() + 3600000);
        System.out.println(date);
    }
}
