package introklasserogobjekter1;

import java.text.DecimalFormat;

public class Oppgave5 {
    public static void main(String[] args) {

        int tall1 = 2;
        int tall2 = 3;

        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println("3 + 1 = " + Kalkulator.addere(tall1, tall2));
        System.out.println("3 - 1 = " + Kalkulator.subtrahere(tall1, tall2));
        System.out.println("3 * 1 = " + Kalkulator.multiplisere(tall1, tall2));
        System.out.println("3 / 1 = " + df.format(Kalkulator.dividere(tall1, tall2)));
    }
}
