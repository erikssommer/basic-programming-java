package oblig3;

import static javax.swing.JOptionPane.*;

public class UnikeTall {

    private final int[] tabell;

    /* Konstruktør som mottar arrayens lengde som parameter og
      oppretter arrayen.  */
    public UnikeTall(int lengde) {
        tabell = new int[lengde];

        fyllArrayMedTilfeldigeTall();
    }

    private boolean finnesIArray(int tall) {
        for (int i : tabell) {
            if (i == tall) {
                return true;
            }
        }
        return false;
    }

    private void fyllArrayMedTilfeldigeTall() {
        int i = 0;
        while(i < tabell.length) {
            int tilfeldigTall = (int)(Math.random() * 900 + 100);

            if(!finnesIArray(tilfeldigTall)) {
                tabell[i] = tilfeldigTall;
                i++;
            }
        }
    }

    // Metode som finner og returnerer det minste tallet i arrayen.
    private int minst() {
        int minstVerdi = tabell[0];

        for(int i = 1; i < tabell.length; i++) {
            // Sjekker om verdien er mindre enn minstVerdi
            if(tabell[i] < minstVerdi) {
                minstVerdi = tabell[i];
            }
        }
        return minstVerdi;
    }

    // Metode som finner og returnerer det største tallet i arrayen.
    private int storst() {
        int storstVerdi = tabell[0];

        for(int i = 1; i < tabell.length; i++) {
            if(tabell[i] > storstVerdi) {
                storstVerdi = tabell[i];
            }
        }
        return storstVerdi;
    }

    /*  Metode som beregner og returnerer den gjennomstnittlige verdien
      (double-verdi) av tallene i arrayen.  */
    private double gjennomsnitt() {
        double sum = 0;
        for(int value : tabell) {
            sum += value;
        }
        return sum / tabell.length;
    }

    public void visInformasjon() {
        String utMelding = "";

        for(int i = 0; i < tabell.length; i++) {
            utMelding += tabell[i] + " ";

            if((i + 1) % 8 == 0) {
                utMelding += "\n";
            }
        }

        utMelding += "\n\n";

        utMelding += "Minste tall er " + minst() + "\n"
                + "Største tall er " + storst() + "\n"
                + "Gjennomsnittsverdien er " + String.format("%.2f",gjennomsnitt()) + "\n";

        showMessageDialog(null, utMelding);
    }
}