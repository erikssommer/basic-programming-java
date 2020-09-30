package kontrollstrukturer2.andreoppgaver;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave4_2 {
    public static void main(String[] args) {
        int nummer;
        int storst = 0;

        for (int teller = 1; teller <= 10; teller++){
            String innTall = showInputDialog("Skriv inn heltall nummer " + teller);
            nummer = Integer.parseInt(innTall);

            if(nummer > storst){
                storst = nummer;
            }
        }
        showMessageDialog(null,"Det største tallet er " + storst);
    }
}
