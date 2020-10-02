package kontrollstrukturer2.andreoppgaver;

// Løsning med rekursjon. Det er ikke pensum, men veldig nyttig.

import javax.swing.*;

public class Oppgave9_2 {
    public static void main(String[] args) {
        int tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall for fakultet: "));

        System.out.println(fak(tall));
    }

    public static long fak(int a){
        if(a <= 1) {
            return 1;
        }

        return a * fak(a-1);
    }
}
