package introklasserogobjekter1;

import javax.swing.*;

public class Oppgave4 {
    public static void main(String[] args) {
        Person enPerson = new Person();
        enPerson.navn = JOptionPane.showInputDialog("Navn: ");
        enPerson.adresse = JOptionPane.showInputDialog("Adresse: ");
        enPerson.telefonnr = JOptionPane.showInputDialog("Telefonnr: ");
        enPerson.fodselsar = Integer.parseInt(JOptionPane.showInputDialog("Fødselsår: "));

        int alder = enPerson.finnAlder();

        enPerson.skrivUtOppgave4(alder);
    }
}
