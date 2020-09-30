package kontrollstrukturer2.andreoppgaver;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave9 {
    public static void main(String[] args) {
        int nummer = Integer.parseInt(showInputDialog("Skriv inn et heltall for fakultet:"));
        int utNummer = nummer;
        int resultat = nummer;

        for (int i = nummer-1; i > 0; i--){
            resultat *= i;
        }

        showMessageDialog(null,utNummer + "! er " + resultat);
    }
}
