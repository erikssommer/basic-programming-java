package introklasserogobjekter1;

import java.text.DecimalFormat;

public class Oppgave5 {
    public static void main(String[] args) {

        int tall1 = 2;
        int tall2 = 3;

        DecimalFormat df = new DecimalFormat("#0.00"); //Ikke spurt om i oppgaven

        System.out.println(tall1 + " + " + tall2 + " = " + Kalkulator.addere(tall1, tall2));
        System.out.println(tall1 + " - " + tall2 + " = " + Kalkulator.subtrahere(tall1, tall2));
        System.out.println(tall1 + " * " + tall2 + " = " + Kalkulator.multiplisere(tall1, tall2));
        System.out.println(tall1 + " / " + tall2 + " = " + df.format(Kalkulator.dividere(tall1, tall2)));
    }
}
