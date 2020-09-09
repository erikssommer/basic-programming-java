package aritmetikk;

import javax.swing.*;

public class Oppgave6 {
    public static void main(String[] args) {
        int dollar = Integer.parseInt(JOptionPane.showInputDialog("Antall dollar: "));

        double norske = dollar * 8.5;

        String melding = dollar + " USD tilsvarer " + norske + " NOK";
    }
}
