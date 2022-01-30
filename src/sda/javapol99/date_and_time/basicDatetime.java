package sda.javapol99.date_and_time;

import java.util.Date;

public class basicDatetime {

    // w najbardziej podstawowym zakresie czas to ilosc miliskekund, ktore uplynely od 1.1.1970
    // new date() poda nam biezacy czas
    //system.currentTimeMillis() zwroci nam milisekundy od 1970
    // date mozemy podac dla znacznika miliksenud i zostanie zamieniony na jakas date ( w przeszlosci
    // lub w przyszlosci

    public static void main(String[] args) {

        Date today = new Date();
        System.out.println(today);

        long milis = System.currentTimeMillis();
        System.out.println(milis);

        Date sometimefromnow = new Date(16479913891398L);
        System.out.println(sometimefromnow);

        // Majac milisekundy moge wyliczyc czas w przeszlosci lub w przyszlosci
        // dodajac lub odejmujac odpowiednia ilosc milisekund

        long twohoursinfuture = milis + (100 *60*60);
        Date future = new Date(twohoursinfuture);
        System.out.println(future);


        // Date ma parę metod pomocnicych do porównania czasu

        if (today.before(future)) {
            System.out.println("Jestem przed deadlinem ufff");
        } else {
            System.out.println("Jestem spozniony");
        }







    }
}
