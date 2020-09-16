package introklasserogobjekter1;

import javax.swing.*;

public class Oppgave2 {
    public static void main(String[] args) {
        Bok enBok = new Bok();
        enBok.tittel = JOptionPane.showInputDialog("Tittel: ");
        enBok.pris = Double.parseDouble(JOptionPane.showInputDialog("Pris: "));
        enBok.forfatter = JOptionPane.showInputDialog("Forfatter: ");
        enBok.isbn = JOptionPane.showInputDialog("iSBN-nummer: ");

        enBok.skrivUtOppgave2();
    }
}
