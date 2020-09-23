package kontrollstrukturer1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave5_2 {
    public static void main(String[] args) {
        String maned = showInputDialog("Angi måned: ");

        switch (maned.toLowerCase()) {
            case "juni", "juli", "august" -> showMessageDialog(null, "Det er sommer");
            case "september", "oktober", "november" -> showMessageDialog(null, "Det er høst");
            case "desemner", "januar", "februar" -> showMessageDialog(null, "Det er vinter");
            case "mars", "april", "mai" -> showMessageDialog(null, "Det er vår");
            default -> showMessageDialog(null, "Feil input, ikke gyldig månedsnavn!");
        }
    }
}
