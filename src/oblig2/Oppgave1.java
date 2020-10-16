package oblig2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave1 {
    public static void main(String[] args) {
        int nedreGrense = 0;
        int ovreGrense = 0;
        showMessageDialog(null,"Skriv inn to verdier: en nedre og en øvre, større enn nedre." );

        while (nedreGrense >= ovreGrense) {
            try {
                String nedreInnStreng = showInputDialog("Skriv inn nedre grense");
                nedreGrense = Integer.parseInt(nedreInnStreng);

                String ovreInnStreng = showInputDialog("Skriv inn øvre grense\nStørre enn " + nedreGrense);
                ovreGrense = Integer.parseInt(ovreInnStreng);
            } catch (Exception e){
                showMessageDialog(null,
                        "Du må skrive inn to gyldige verdier, der øvre grense er større enn nedre grense");
            }
        }

        int sum = 0;
        int teller = 0;
        String melding = "";

        for (int i = nedreGrense; i < ovreGrense; i++) {
            if(teller == 10){
                melding += "\n";
                teller = 0;
            }

            teller++;
            sum += i;
            melding += i + " + ";
        }

        sum += ovreGrense;
        melding += ovreGrense + " = " + sum;
        showMessageDialog(null, melding);
    }
}
