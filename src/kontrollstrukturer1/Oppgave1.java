package kontrollstrukturer1;

import javax.swing.*;

public class Oppgave1 {
    public static void main(String[] args) {
        int alder = Integer.parseInt(JOptionPane.showInputDialog("Alder: "));

        if (alder >= 18 && alder <= 20){
            JOptionPane.showMessageDialog(null, "Du er myndig, men kan ikke kjøpe alkohol" +
                    " med mer enn 22% på polet");
        }else {
            JOptionPane.showMessageDialog(null, "Du er enten umyndig eller så kan du kjøpe" +
                    " hva du vil på polet");
        }
    }
}
