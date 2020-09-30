package kontrollstrukturer2.andreoppgaver;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave7 {
    public static void main(String[] args) {
        int innTall = Integer.parseInt(showInputDialog("Skriv inn et heltall mellom 1 og 10"));
        String ut = "";

        for (int i = 0; i <= innTall; i++){
            for (int j = 0; j < i; j++){
                ut += "*";
            }
            ut += "\n";
        }
        showMessageDialog(null, ut);
    }
}
