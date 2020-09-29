package kontrollstrukturer2.vanskelige;

import javax.swing.*;

public class Oppgave1_1 {
    public static void main(String[] args) {
        int nummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall for antall: "));

        double pi = 4;
        int fortegn = -1;
        for (long i = 3; i < nummer; i+=2){
            pi += fortegn * (4/(double) i);
            fortegn = -fortegn;
        }
        JOptionPane.showMessageDialog(null, "PI skal være 3.14159265358.\nBlir: " + pi);
    }
}
