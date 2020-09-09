package variabler2;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave2 {
    public static void main(String[] args) {
        String innTall1 = showInputDialog("Skriv inn tall 1: ");
        String innTall2 = showInputDialog("Skriv inn tall 2: ");
        String innTall3 = showInputDialog("Skriv inn tall 3: ");

        double tall1 = Double.parseDouble(innTall1);
        double tall2 = Double.parseDouble(innTall2);
        double tall3 = Double.parseDouble(innTall3);

        double sum = tall1 + tall2 + tall3;

        System.out.println(sum);
    }
}
