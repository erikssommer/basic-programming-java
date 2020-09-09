package aritmetikk;

import javax.swing.*;
import java.text.DecimalFormat;

public class Oppgave4 {
    public static void main(String[] args) {
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn radius: "));

        double omkrets = 2 * Math.PI + radius;

        //Hvilken metode du velger å bruke er smak og behag

        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        String omkretsenMedToDesimaler = String.format("%.2f", omkrets);

        String melding1 = "Omkretsen av en sirkel med " + radius + " cm som radius blir " + omkretsenMedToDesimaler +
                " cm";

        String melding2 = "Omkretsen av en sirkel med " + radius + " cm som radius blir " + decimalFormat.format(omkrets) +
                " cm";

        System.out.println(melding1);
        System.out.println(melding2);

    }
}
