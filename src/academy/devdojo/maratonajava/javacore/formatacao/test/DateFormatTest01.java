package academy.devdojo.maratonajava.javacore.formatacao.test;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;


public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);
        double valor = 1_000.2130;
        NumberFormat[] nfa = new NumberFormat[] {
            NumberFormat.getInstance(),
            NumberFormat.getCurrencyInstance(),
            NumberFormat.getPercentInstance()
        };

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }
    }
}