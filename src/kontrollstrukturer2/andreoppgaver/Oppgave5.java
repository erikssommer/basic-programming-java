package kontrollstrukturer2.andreoppgaver;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave5 {
    public static void main(String[] args) {
        int nummer;
        int storsteTall = 0;
        int nestStorsteTall = 0;

        for (int teller = 0; teller <= 10; teller++){
            nummer = Integer.parseInt(showInputDialog("Skriv inn et heltall:"));

            if(nummer > storsteTall){
                nestStorsteTall = storsteTall;
                storsteTall = nummer;
            }else if (nummer > nestStorsteTall){
                nestStorsteTall = nummer;
            }
        }
        showMessageDialog(null, "Det største tallet er " + storsteTall + "\n" +
                "Det nest største tallet er " + nestStorsteTall);
    }
}
