package sda.javapol99.date_and_time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class TimeZonedDateTime {

    public static void main(String[] args) {

        Instant now = Instant.now();
        System.out.println(now);

        // mozemy instant zaminiec na datoczas z informacja o strefie czasowej
        // ponizej przyklad z uzycia strefy czasowej z naszego komptura


        ZonedDateTime zdt = now.atZone(ZoneId.systemDefault());
        System.out.println(zdt);

        // majac zoned date time mozemy wyciagac szczegolowe informacje
        System.out.println("godzina: " + zdt.getHour());
        System.out.println("dzien tygodnia: " + zdt.getDayOfWeek());
        System.out.println("dzien miesiaca: " + zdt.getDayOfMonth());

        // Wyciagamy pelna nazwe miesiaca po francusku :

        System.out.println("miesiąc: " + zdt.getMonth().getDisplayName(TextStyle.FULL, Locale.FRENCH));

        ZoneOffset offset = zdt.getOffset();
        System.out.println("zone id: " + offset.getId());

        // inne strefy czasowe niz naszego komputera mozemy zrobic tak :

        //ZonedDateTime zdt1 = now.atZone(ZoneId.of()); - mozna dodac lub odjąc wartosc do czasu
        //ZonedDateTime zdt2 = now.atZone(ZoneId.of()); - mozna dodac lub odjac wartosc od czasu
        ZonedDateTime zdt3 = now.atZone(ZoneId.ofOffset("UTC", ZoneOffset.ofHours(2)));
        System.out.println(zdt3);

    }


}
