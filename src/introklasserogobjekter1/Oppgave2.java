package introklasserogobjekter1;

import javax.swing.*;

public class Oppgave2 {
    public static void main(String[] args) {
        Bok boken = new Bok();
        boken.tittel = JOptionPane.showInputDialog("Tittel: ");
        boken.pris = Double.parseDouble(JOptionPane.showInputDialog("Pris: "));
        boken.forfatter = JOptionPane.showInputDialog("Forfatter: ");
        boken.isbn = JOptionPane.showInputDialog("iSBN-nummer: ");

        boken.skrivUtOppgave2();
    }
}
