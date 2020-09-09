package aritmetikk;

import javax.swing.*;

public class Oppgave10 {
    public static void main(String[] args) {
        int alder = Integer.parseInt(JOptionPane.showInputDialog("Din alder: "));

        /*
        if (alder >= 18){
            System.out.println("Du er myndig og kan ta lappen");
        }
        if (alder < 18){
            System.out.println("Du er ikke myndig. Du må dessverre vente litt");
        }

         */

        if (alder >= 18){
            System.out.println("Du er myndig og kan ta lappen");
        } else {
            System.out.println("Du er ikke myndig. Du må dessverre vente litt");
        }


    }
}
