package kontrollstrukturer1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave5_1 {
    public static void main(String[] args) {

        String maned = showInputDialog("Angi måned: ");

        switch(maned.toLowerCase()) {
            case "juni":
            case "juli":
            case "august":
                showMessageDialog(null, "Det er sommer");
                break;
            case "september":
            case "oktober":
            case "november":
                showMessageDialog(null, "Det er høst");
                break;
            case "desemner":
            case "januar":
            case "februar":
                showMessageDialog(null, "Det er vinter");
                break;
            case "mars":
            case "april":
            case "mai":
                showMessageDialog(null, "Det er vår");
                break;
            default:
                showMessageDialog(null, "Feil input, ikke gyldig månedsnavn!");
                break;
        }
    }
}
