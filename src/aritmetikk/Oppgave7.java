package aritmetikk;

import javax.swing.*;

public class Oppgave7 {
    public static void main(String[] args) {
        int antPersoner = Integer.parseInt(JOptionPane.showInputDialog("Antall personer: "));
        int antPizza = Integer.parseInt(JOptionPane.showInputDialog("Antall pizza: "));
        int antSlices = Integer.parseInt(JOptionPane.showInputDialog("Antall slices: "));

        int antSlicesPerPerson = (antPizza * antSlices) / antPersoner;
        int rest = (antPizza * antSlices) % antPersoner;

        String melding = "Dersom man er " + antPersoner + " personer og har " + antPizza + " pizzaer med " + antSlices +
                " slices per pizza får hver person " + antSlicesPerPerson + " slices. Det gir en rest på " + rest;

        System.out.println(melding);
    }
}
