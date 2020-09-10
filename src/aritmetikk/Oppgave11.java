package aritmetikk;

import javax.swing.*;

public class Oppgave11 {
    public static void main(String[] args) {

        //Alternativ 1 (Slik det står i løsningsforslaget gitt)
        /*
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

         */

        //Alternativ 2 (I min mening en litt mer enkel løsning å forstå og utføre)
        int innTall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn tallet: "));
        int tall1, tall2, tall3;

        tall1 = innTall / 100;        // --> 7,51 = 7
        tall2 = (innTall % 100) / 10; // --> (51) / 10 = 5,1 = 5
        tall3 = innTall % 10;         // --> 1

        int tverrsum = tall1 + tall2 + tall3;

        System.out.println("Tverrsummen av " + innTall + " er " + tverrsum);

    }
}
