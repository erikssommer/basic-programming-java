package aritmetikk;

import javax.swing.*;

public class Oppgave3 {
    public static void main(String[] args) {
        double lengde = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn lengden: "));
        double bredde = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn bredden: "));

        double areal = lengde * bredde;

        String melding = "Et rektangel med bredde " + bredde + " cm og en lengde " + lengde + " cm" +
                ", har et areal på " + areal + " cm^2";

        System.out.println(melding);

    }
}
