package kontrollstrukturer2.andreoppgaver;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave3 {
    public static void main(String[] args) {
        String innInntekt;
        double inntekt;
        double skatt;
        String ut = "";

        for (int i = 1; i < 4; i++){
            innInntekt = showInputDialog("Skriv inn inntekten til personen");
            inntekt = Double.parseDouble(innInntekt);
            if(inntekt > 500_000){
                skatt = (inntekt - 500_000) * 0.5;
                skatt += 500_000 * 0.3;
            }
            else{
                skatt = inntekt * 0.3;
            }
            ut += "Inntekt på " + innInntekt +" kr gir skatt på " + skatt + " kr\n";
        }
        showMessageDialog(null, ut);
    }
}
