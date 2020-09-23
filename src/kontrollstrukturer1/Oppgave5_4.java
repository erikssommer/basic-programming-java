package kontrollstrukturer1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * Riktig løst, men den dårligste implementasjonen av oppgaven
 */

public class Oppgave5_4 {
    public static void main(String[] args) {
        String maned = showInputDialog("Angi måned (f.eks mars)?");

        if(maned.equals("juni") || maned.equals("juli") || maned.equals("august")){
            showMessageDialog(null, "Det er sommer");
        }
        if(maned.equals("september") || maned.equals("oktober") || maned.equals("november")){
            showMessageDialog(null, "Det er høst");
        }
        if(maned.equals("desember") || maned.equals("januar") || maned.equals("februar")){
            showMessageDialog(null, "Det er vinter");
        }
        if(maned.equals("mars") || maned.equals("april") || maned.equals("mai")){
            showMessageDialog(null, "Det er vår");
        }
    }
}
