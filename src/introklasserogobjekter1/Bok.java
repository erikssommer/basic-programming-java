package introklasserogobjekter1;

import javax.swing.*;

public class Bok{
    public String tittel;
    public double pris;
    public String forfatter;
    public String isbn;

    public void skrivUtOppgave1(){
        System.out.println("Tittel: " + tittel);
        System.out.println("Pris " + pris);
        System.out.println("Forfatter: " + forfatter);
        System.out.println("iSBN-nummer: " + isbn);
    }

    public void skrivUtOppgave2(){
        String melding = "Tittel: " + tittel + ", pris: " + pris + ", forfatter: " + forfatter +
                ", iSBN-nummer: " + isbn;
        JOptionPane.showMessageDialog(null, melding);
    }
}
