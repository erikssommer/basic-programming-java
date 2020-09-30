package kontrollstrukturer2.andreoppgaver;

import javax.swing.*;

public class Oppgave4 {
    public static void main(String[] args) {
        int teller = 0;
        int nummer = 0;
        int storst = 0;

        while (teller < 10){
            nummer = Integer.parseInt(JOptionPane.showInputDialog("Tall " + teller));
            if (nummer > storst){
                storst = nummer;
            }
            teller++;
        }

        System.out.println(storst);
    }
}
