package variabler2;

import javax.swing.*;

public class Oppgave4 {
    public static void main(String[] args) {

        double tall1, tall2, tall3;

        try {
            tall1 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn tall 1: "));
            tall2 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn tall 2: "));
            tall3 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn tall 3: "));
        } catch (Exception e) {
            tall1 = 0;
            tall2 = 0;
            tall3 = 0;
            JOptionPane.showMessageDialog(null, "Du har oppgitt noe feil. Prøv på nytt!");
        }

        double sum = tall1 + tall2 + tall3;

        double snitt = sum / 3;

        System.out.println(snitt);
    }
}
