package oblig1;

import javax.swing.*;

public class Oppgave2 {
    public static void main(String[] args) {
        // les inn navn, antall og pris for vare 1
        String navn1 = JOptionPane.showInputDialog("Navn på vare 1: ");
        String innAntall1 = JOptionPane.showInputDialog("Antall av vare 1: ");
        String innPris1 = JOptionPane.showInputDialog("Pris på vare 1: ");

        // les inn navn, antall og pris for vare 2
        String navn2 = JOptionPane.showInputDialog("Navn på vare 2: ");
        String innAntall2 = JOptionPane.showInputDialog("Antall av vare 2: ");
        String innPris2 = JOptionPane.showInputDialog("Pris på vare 2: ");

        // bruk avvikshåntering (try/catch) for å konvertere
        // antall og pris for vare 1 og vare 2
        int antall1, antall2;
        double pris1, pris2;

        //Kan med fordel ha 4 try/catch-blokker for å gi en mer spesifikk tilbakemelding og ikke resette alle til 0
        try {
            antall1 = Integer.parseInt(innAntall1);
            antall2 = Integer.parseInt(innAntall2);
            pris1 = Double.parseDouble(innPris1);
            pris2 = Double.parseDouble(innPris2);
        }catch (Exception e){
            antall1 = 0;
            antall2 = 0;
            pris1 = 0;
            pris2 = 0;
            System.out.println("Klarte ikke å konvertere alle verdiene. Alle blir satt til 0");
        }

        // opprett to vare-objekter med de innleste verdiene
        Vare vare1 = new Vare(navn1, antall1, pris1);
        Vare vare2 = new Vare(navn2, antall2, pris2);

        // beregn og skriv ut total pris for alle varer i System.out
        double totalpris = vare1.totalpris() + vare2.totalpris();

        System.out.println("Totalprisen ble: " + String.format("%.1f", totalpris) + "kr");
    }
}
