package sda.javapol99.date_and_time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class excercisedate_time {
    public static void main(String[] args) {

        Instant now = Instant.now();

        Instant threedays = now.plus(3, ChronoUnit.DAYS);
        Instant twentysevendays = now.plus(27, ChronoUnit.DAYS);

        ZonedDateTime zdt3 = threedays.atZone(ZoneId.of("-05:00"));
        ZonedDateTime zdt27 = twentysevendays.atZone(ZoneId.of("+03:45"));

        // za 3 dni miesiąc po wlosku, dzien miesiaca, dzien tyg po niemiecku, godzina:
        System.out.println(
                zdt3.getMonth().getDisplayName(TextStyle.FULL, Locale.ITALIAN)
                + " "
                +zdt3.getDayOfMonth()
                +" "
                +zdt3.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.GERMAN)
                +" "
                + zdt3.getHour());

                // dzien tygodnia po japonsku, numer miesiaca, rok godzine i minuty

        System.out.println(
                zdt27.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.JAPANESE)
                + " "
                + zdt27.getMonth()
                + " "
                + zdt27.getYear()
                + " "
                + zdt27.getMinute())


        ;

    }
}