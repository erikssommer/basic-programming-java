package aritmetikk;

import javax.swing.*;

public class Oppgave5 {
    public static void main(String[] args) {
        String innFahrenheit = JOptionPane.showInputDialog("Skriv inn fahrenheit: ");
        double fahrenheit = Double.parseDouble(innFahrenheit);

        double cesius = (fahrenheit - 32)/1.8;

        String celsiusMedToDesimaler = String.format("%.2f" , cesius);

        String melding = fahrenheit + " grader fahrenheit gir " + celsiusMedToDesimaler + " grader celsius";

        System.out.println(melding);
    }
}
