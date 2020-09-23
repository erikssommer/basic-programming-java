package introklasserogobjekter2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave6 {
    public static void main(String[] args) {
        double vind = Double.parseDouble(showInputDialog("Oppgi vindhastigheten: "));

        Vind sjekkVind = new Vind(vind);

        String ut = "Vindhastigheten er " + sjekkVind.getVindhastighet() + "\n";

        if (sjekkVind.erOrkan()) {
            ut += "Det er orkan!\n";
        }

        if(sjekkVind.erStille()) {
            ut += "Det er stille\n";
        }

        String knop = String.format("%.2f", sjekkVind.getKnop());
        ut += "Det er " + knop + " knop\n";
        ut += "Og det tilsvarer " + sjekkVind.getBeaufort() + " på beaufort skalaen!";

        showMessageDialog(null, ut);
    }
}
