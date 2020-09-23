package introklasserogobjekter2;

import javax.swing.*;

public class Oppgave1 {
    public static void main(String[] args) {
        String fornavn = JOptionPane.showInputDialog("Fornavn: ");
        String etternavn = JOptionPane.showInputDialog("Etternavn: ");
        String adresse = JOptionPane.showInputDialog("Adresse: ");
        String telefonnr = JOptionPane.showInputDialog("Telefonnr: ");

        Person person = new Person(fornavn, etternavn, adresse, telefonnr);
        person.skrivUt();
    }
}
