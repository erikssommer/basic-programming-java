package introklasserogobjekter2;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave5 {
    public static void main(String[] args) {
        String innKontoNavn = showInputDialog("Anngi kontonavn: ");
        String innKontoNr = showInputDialog("Angi kontonummer: ");
        double innSaldo = Double.parseDouble(showInputDialog("Angi saldo: "));

        Konto sparekonto = new Konto(innKontoNavn, innKontoNr, innSaldo);

        System.out.println(sparekonto.settInn(1000));
        System.out.println(sparekonto.taUt(10));
        System.out.println(sparekonto.settInn(1000));

        sparekonto.utskrift();
    }
}
