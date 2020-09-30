package kontrollstrukturer2.andreoppgaver;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave1 {
    public static void main(String[] args) {
        String innKm = showInputDialog("Skriv inn antall km på denne turen, avslutt med 0");
        double antallKM = Double.parseDouble(innKm);
        String innLiter = showInputDialog("Skriv inn antall liter som ble brukt på turen:");
        double antallLiter = Double.parseDouble(innLiter);
        double totaltAntallKM = 0, totaltAntallLiter = 0;

        while (antallKM > 0) {
            totaltAntallKM += antallKM;
            totaltAntallLiter += antallLiter;
            innKm = showInputDialog("Skriv inn antall km på denne turen, avslutt med 0");
            antallKM = Double.parseDouble(innKm);
            innLiter = showInputDialog("Skriv inn antall liter som ble brukt på turen:");
            antallLiter = Double.parseDouble(innLiter);
        }
        double gjennomsnitt = totaltAntallLiter / totaltAntallKM * 10;
        showMessageDialog(null, "Gjennomsnittelig forbruk pr mil er " + gjennomsnitt + " liter");
    }
}

