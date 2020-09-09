package variabler2;

import javax.swing.*;

//Dette er en løsning med boolean og en løkke som kjører helt til bruker har skrevet inn gyldige vedier i
//alle tre meldingsboksene

public class Oppgave4Alt2 {
    public static void main(String[] args) {

        double tall1, tall2, tall3;
        boolean feilInput = true;

        do {
            try {
                tall1 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn tall 1: "));
                tall2 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn tall 2: "));
                tall3 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn tall 3: "));
                feilInput = false;
            } catch (Exception e) {
                tall1 = 0;
                tall2 = 0;
                tall3 = 0;
                JOptionPane.showMessageDialog(null, "Du har oppgitt noe feil. Prøv på nytt!");
            }
        } while (feilInput);

        double sum = tall1 + tall2 + tall3;

        double snitt = sum / 3;

        System.out.println(snitt);
    }
}
