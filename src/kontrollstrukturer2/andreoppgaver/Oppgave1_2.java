package kontrollstrukturer2.andreoppgaver;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

// Alternativ løsning med do - while

public class Oppgave1_2 {
    public static void main(String[] args) {
        String innKM, innLiter;
        double antallKM, antallLiter;
        double totaltAntallLiter=0, totaltKM=0;

        do{
            innKM = showInputDialog("Skriv inn antall km på denne turen, avslutt med 0");
            antallKM = Double.parseDouble(innKM);
            innLiter = showInputDialog("Skriv inn antall liter som er brukt på turen!");
            antallLiter = Double.parseDouble(innLiter);
            totaltAntallLiter += antallLiter;
            totaltKM += antallKM;
        }while (antallKM > 0);

        double snitt = totaltAntallLiter / totaltKM * 10;

        showMessageDialog(null, "Gjennomsnittlig forbruk pr mil er "+snitt+" liter");
    }
}
