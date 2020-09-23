package kontrollstrukturer1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave5_3 {
    public static void main(String[] args) {

        String maned = showInputDialog("Angi måned (f.eks mars)?").toLowerCase();

        if(maned.equals("juni") || maned.equals("juli") || maned.equals("august")){
            showMessageDialog(null, "Det er sommer");
        }
        else if(maned.equals("september") || maned.equals("oktober") || maned.equals("november")){
            showMessageDialog(null, "Det er høst");
        }
        else if(maned.equals("desember") || maned.equals("januar") || maned.equals("februar")){
            showMessageDialog(null, "Det er vinter");
        }
        else if(maned.equals("mars") || maned.equals("april") || maned.equals("mai")){
            showMessageDialog(null, "Det er vår");
        }
        else {
            showMessageDialog(null, "Det er ikke en gyldig måned!");
        }
    }
}
