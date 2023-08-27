public class Main {
    public static void main(String[] args) {
        System.out.println("Homew2");

        System.out.println("Aufgabe 1");
        int apple = -1234;
    byte n = 50;
    short kiwi = 32500;
    long datteln = 10_000_000;
    float tomate = 3.5f;
    double birne = 1.8;

    System.out.println("значение переменной apple с типом int равно " + apple);
    System.out.println("значение переменной n с типом byte равно " + n );
    System.out.println("значение переменной kiwi с типом short равно " + kiwi);
    System.out.println("значение переменной datteln с типом long равно " + datteln);
    System.out.println("значение переменной tomate с типом float равно " + tomate);
    System.out.println("значение переменной birne с типом double равно " + birne);

    System.out.println("Aufgabe 2");
    float a = 27.12f;
    long b = 987_678_965_549L;
    double c = 2.786;
    char d = 569;
    short e = -159;
    int f = 27897;
    byte g = 67;

    System.out.println("Aufgabe 3");
    int schuelerKlasse1 = 23;
    int schuelerKlasse2 = 27;
    int schuelerKlasse3 = 30;
    int schuelerGesamt = schuelerKlasse1 + schuelerKlasse2 + schuelerKlasse3;
    int papierGesamt = 480;
    int papierProSchueler = papierGesamt / schuelerGesamt;
    System.out.println("Jeder Schüler bekommt " + papierProSchueler + " Blätter Papier");

    System.out.println("Aufgabe 4");
    int flaschenProMinute = 16 / 2;
    int flaschenPro20Minute = 20 * flaschenProMinute;
    int minuteProTag = 24 * 60;
    int flaschenProTag = minuteProTag * flaschenProMinute;
    int flaschenPro3Tagen = flaschenProTag * 3;
    int flaschenProMonat = flaschenProTag * 31;
    System.out.println("In 20 minuten wurden " + flaschenPro20Minute + " Flaschen hergestellt");
    System.out.println("An einem Tag wurden " + flaschenProTag + " Flaschen hergestellt");
    System.out.println("In 3 Tagen wurden " + flaschenPro3Tagen + " Flaschen hergestellt");
    System.out.println("In einem Monat wurden " + flaschenProMonat + " Flaschen hergestellt");

    System.out.println("Aufgabe 5");
    int farbeGesamt = 120;
    int weiseFarbeProKlasse = 2;
    int brauneFarbeProKlasse = 4;
    int klassenGesamt = farbeGesamt / (weiseFarbeProKlasse + brauneFarbeProKlasse);
    int weiseFarbe = klassenGesamt * weiseFarbeProKlasse;
    int brauneFarbe = klassenGesamt * brauneFarbeProKlasse;
    System.out.println("An der Schule mit " + klassenGesamt + " Klassen braucht man " + weiseFarbe + " Flaschen Weißer Farbe und " + brauneFarbe + " Flaschen Brauner Farbe");

    System.out.println("Aufgabe 6");
    int banane = 5;
    int einBananeInGr = 80;
    int milch = 200 / 100;
    int einhundertMlMilchInGr = 105;
    int eis = 2;
    int eisInGr = 100;
    int eier = 4;
    int einEiInGr = 70;
    int fruestueckInGr = banane * einBananeInGr + milch *einhundertMlMilchInGr + eis * einEiInGr + eier * einEiInGr;
    float fruestueckInKg = fruestueckInGr / 1000F;
    System.out.println("Frühstück in Gr " + fruestueckInGr);
    System.out.println("Frühstück in Kg " + fruestueckInKg);

    System.out.println("Aufgabe 7");

    int gewichtGesamtInGr = 7 * 1000;
    int minGewichtabnahmeProTag = 250;
    int maxGewichtabnahmeProTag = 500;
    int minGewichtverlust = gewichtGesamtInGr / maxGewichtabnahmeProTag;
    int maxGewichtverlust = gewichtGesamtInGr / minGewichtabnahmeProTag;
    double durchschnitVerlustTage = (minGewichtverlust + maxGewichtverlust) / 2D;
    System.out.println("minGewichtverlust = " + minGewichtabnahmeProTag);
    System.out.println("maxGewichtverlust = " + maxGewichtabnahmeProTag);
    System.out.println("durchschnitVerlusstTage = " + durchschnitVerlustTage);

    System.out.println("Aufgabe 8");
    double maschaJahresverdienst = 67760;
    double denisJahresverdienst = 83690;
    double kristinaJahresverdienst = 76230;
    double neueKoeffizient = 1.1;

    double maschaneulohn = maschaJahresverdienst * neueKoeffizient;
    double denisneulohn = denisJahresverdienst * neueKoeffizient;
    double kristinaneulohn = kristinaJahresverdienst * neueKoeffizient;

    double maschaDifferenz = 12 * (maschaneulohn - maschaJahresverdienst);
    double denisDifferenz = 12 * (denisneulohn - denisJahresverdienst);
    double kristinaDifferenz = 12 * (kristinaneulohn - kristinaJahresverdienst);
    System.out.println("Mascha verdient jetz " + maschaneulohn + " Rubel. Jahresverdienst ist um " + maschaDifferenz + " gestiegen");
    System.out.println("Denis verdient jetz " + denisneulohn + " Rubel. Jahresverdienst ist um " + denisDifferenz + " gestiegen");
    System.out.println("Kristina verdient jetz " + kristinaneulohn + " Rubel. Jahresverdienst ist um " + kristinaDifferenz + " gestiegen");




    }
}