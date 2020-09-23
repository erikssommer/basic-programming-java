package kontrollstrukturer1;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave4_2 {
    public static void main(String[] args) {
        int alder = Integer.parseInt(showInputDialog("Alder: "));

        if(alder >= 70) {
            showMessageDialog(null,"Du er absolutt gammel nok for å kjøre bil,"+
                    " men må ha årlige legesjekker");
        }
        if (alder >= 18 && alder < 70){
            showMessageDialog(null,"Du kan ta førerkort for bil og du trenger "+
                    "ikke årlige legesjekker");
        }
        if(alder < 18){
            showMessageDialog(null,"Du er for ung til å ta førerkort for bil");
        }
    }
}
