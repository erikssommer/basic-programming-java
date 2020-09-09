package aritmetikk;

import javax.swing.*;

public class Oppgave1 {
    public static void main(String[] args) {
        String navn = JOptionPane.showInputDialog("Navnet ditt: ");
        String innAlder = JOptionPane.showInputDialog("Alderen din: ");
        int alder = Integer.parseInt(innAlder);

        int fodselsaar = 2020 - alder;
        int pensjonist = fodselsaar + 67;

        String melding = navn + " er i dag " + alder + " år. Hen er født i " + fodselsaar + ". I " + pensjonist +
                " er han 67år og vil da være pensjonist";

        System.out.println(melding);
    }
}

