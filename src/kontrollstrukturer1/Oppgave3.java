package kontrollstrukturer1;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave3 {
    public static void main(String[] args) {
        int alder = Integer.parseInt(showInputDialog("Alder: "));

        if(alder < 18){
            showMessageDialog(null,"Du er for ung til å ta førerkort for bil");
        }
        else {
            //Er over 18 år her!
            showMessageDialog(null, "Du kan ta førerkortet for bil da du er gammel nok");
        }
    }
}
