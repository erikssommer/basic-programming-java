package aritmetikk;

import javax.swing.*;

public class Oppgave11 {
    public static void main(String[] args) {
        int tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn tallet: "));
        int utTall = tall;
        int sum = 0;
        int enkeltTall;
        enkeltTall = tall % 10;
        sum += enkeltTall;
        tall = tall / 10;
        enkeltTall = tall % 10;
        sum += enkeltTall;
        tall = tall / 10;
        sum += tall;

        String melding = "Tverrsummen av tallet " + utTall + " er " + sum;

        System.out.println(melding);
    }
}
