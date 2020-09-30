package kontrollstrukturer2.andreoppgaver;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave8 {
    public static void main(String[] args) {
        int nummer, tall1, tall2;

        do{
            nummer = Integer.parseInt(showInputDialog("Skriv inn et femsifret heltall:"));
        } while (nummer < 10_000 || nummer > 100_000);

        // her er nummer mellom 10_000 og 99_999
        // sjekk første og siste tall
        boolean palindrom1 = false;
        boolean palindrom2 = false;

        tall1 = nummer / 10_000;
        tall2 = nummer % 10;

        if(tall1 == tall2){
            palindrom1 = true;
        }

        nummer = (nummer - tall1 * 10_000)/10;
        // sjekk første og siste tall
        tall1 = nummer / 100;
        tall2 = nummer % 10;

        if(tall1 == tall2){
            palindrom2 = true;
        }

        if(palindrom1 && palindrom2){
            showMessageDialog(null,"Palindrom");
        } else{
            showMessageDialog(null,"Ikke palindrom");
        }
    }
}
