package kontrollstrukturer1;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave4_1 {
    public static void main(String[] args) {
        int alder = Integer.parseInt(showInputDialog("Alder: "));

        if(alder < 18) {
            // starter med den minste grensen : 18
            showMessageDialog(null,"Du er for ung til å ta førerkort for bil");
        }
        else if (alder < 70){
            showMessageDialog(null,"Du kan ta førerkort for bil og du trenger "+
                    "ikke årlige legesjekker");
        }
        else {
            showMessageDialog(null,"Du er absolutt gammel nok for å kjøre bil,"+
                    " men må ha årlige legesjekker");
        }
    }
}
