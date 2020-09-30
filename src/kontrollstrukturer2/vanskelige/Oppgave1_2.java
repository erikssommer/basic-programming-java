package kontrollstrukturer2.vanskelige;

import javax.swing.*;

public class Oppgave1_2 {
    public static void main(String[] args) {

        int iterasjoner = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall for antall: "));
        double pi = 0;

        for (int i = 0; i < iterasjoner; i++){
            pi += 4 * (Math.pow(-1, i)/(2*i+1));
        }

        System.out.println("Med " + iterasjoner + " iterasjoner blir pi = " + pi);
    }
}
