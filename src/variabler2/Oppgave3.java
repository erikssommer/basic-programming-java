package variabler2;

import javax.swing.*;
import java.text.DecimalFormat;

public class Oppgave3 {
    public static void main(String[] args) {
        String innTall1 = JOptionPane.showInputDialog("Skriv inn tall 1: ");
        String innTall2 = JOptionPane.showInputDialog("Skriv inn tall 2: ");
        String innTall3 = JOptionPane.showInputDialog("Skriv inn tall 3: ");

        double tall1 = Double.parseDouble(innTall1);
        double tall2 = Double.parseDouble(innTall2);
        double tall3 = Double.parseDouble(innTall3);

        double sum = tall1 + tall2 + tall3;

        double snitt = sum / 3;

        //En løsning til å bare ha 2 desimaler i svaret (ikke nødvendig)
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println(df.format(snitt));
    }
}
