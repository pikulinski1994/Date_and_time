package sda.javapol99.date_and_time;

import java.time.Duration;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Instant {
    public static void main(String[] args) {

      java.time.Instant Thismoment = java.time.Instant.now();
        System.out.println(Thismoment);



        Thismoment = java.time.Instant.now();
        System.out.println(Thismoment);

        // Instant na date troche trudniej ale tez sie da

        Date tmp = new Date(Thismoment.toEpochMilli());

        java.time.Instant thismoment = java.time.Instant.now();
        System.out.println(thismoment);

        System.out.println(thismoment.toEpochMilli());
        System.out.println(thismoment.getEpochSecond());

        // do instant mozemy dodac jakis okres czasu (Duration)
        // ale wazne! Instan jest niemozliwy! to znaczy ze
        // wykonujac na nim bliczenia nie zmieniamy biezacego obiektu ,
        // ale tworzymy nowy z nowymi danymi

        java.time.Instant twodaysfromnow = Thismoment.plus(Duration.ofDays(2));
        System.out.println(Thismoment); // nie uleglo zmianie pomimo dodania czasu
        System.out.println(twodaysfromnow);

        java.time.Instant threehoursbefore = Thismoment.minus(3, ChronoUnit.HOURS);
        System.out.println(threehoursbefore);

        // nie mozemy wyciagnac z instant godziny czy podobnych informacji
        // jedynie ile milisekund/mikrosekund/nanosekund uplynelo od ostaniej pelnej sekundy

        int hour = Thismoment.get(ChronoField.MILLI_OF_SECOND);
        System.out.println("millis in second:" + hour);








    }
}
