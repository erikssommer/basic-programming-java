package variabler1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave1_2_3_4 {
    public static void main(String[] args) {
        String fornavn = showInputDialog("Fornavn: ");
        String etternavn = showInputDialog("Etternavn: ");
        String alder = showInputDialog("Alder: ");
        String adresse = showInputDialog("Adresse: ");
        String poststed = showInputDialog("Poststed: ");
        String postnr = showInputDialog("Postnr: ");

        //Melding for oppgave 1
        String melding1 = "Du heter " + fornavn + " " + etternavn;

        //Melding for oppgave 2
        String melding2 = "Alderen til " + fornavn + " " + etternavn +
                " er " + alder + " år.";

        //Melding for oppgave 3
        String melding3 = fornavn + " " + etternavn + " bor i " +
                adresse + " som har postnummer " + postnr + " i " +
                poststed + ". " + fornavn + "´s alder er " + alder + " år.";

        //Melding for oppgave 4
        String melding4 = "Navn: " + fornavn + " " + etternavn + "\n" +
                "Adresse: " + adresse + "\n" +
                "Postnummer: " + postnr + "\n" +
                "Poststed: " + poststed + "\n" +
                "Alder: " + alder + " år.";

        //Her er det bare til å bytte mellom hvilken melding som skal vises
        showMessageDialog(null, melding4);
        System.out.println(melding4);
    }
}
