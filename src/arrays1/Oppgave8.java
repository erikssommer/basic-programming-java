package arrays1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave8 {
    public static void main(String[] args) {
        // hvor mange poengsummer skal leses inn?
        int antall, poeng;
        String innAntall, innPoeng;
        innAntall = showInputDialog("Hvor mange poengsummer skal leses inn?");

        try {
            antall = Integer.parseInt(innAntall);
        } catch(Exception e){
            showMessageDialog(null,"Feil, det ble ikke satt noe antall, avslutter!");
            antall = 0;
        }

        int [] poengsum = new int [antall];
        while (antall > 0){
            // les inn poengsummer inn i arrayet
            innPoeng = showInputDialog("Skriv inn en poengsum:");
            try {
                poeng = Integer.parseInt(innPoeng);
                poengsum[antall-1] = poeng; // fyller arrayet baklengs, lettere!
                antall--;
            } catch (Exception e) {
                showMessageDialog(null,"Feil i input av poengsum, trykk Enter");
            }
        }

        // gjennomsnittet
        int sum = 0;
        for (int i : poengsum){
            sum += i;
        }

        if(poengsum.length > 0){
            double gjennomsnitt = (double)sum / poengsum.length;
            showMessageDialog(null,"Gjennomsnittet er " + String.format("%.2f", gjennomsnitt));
        }
    }
}
