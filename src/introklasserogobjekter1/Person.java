package introklasserogobjekter1;

import javax.swing.*;

public class Person {
    public String navn;
    public String adresse;
    public String telefonnr;
    public int fodselsar;

    public int alder(){
        return 2020 - fodselsar;
    }

    public void skrivUtOppgave3(int alder){
        String melding = navn + " med adresse " + adresse + " med telefonnummer " + telefonnr +
                " er " + alder + " år.";
        System.out.println(melding);
    }

    public void skrivUtOppgave4(int alder){
        String melding = "Navn: " + navn + "\n" +
                "Adresse: " + adresse + "\n" +
                "Telefonnr: " + telefonnr + "\n" +
                "Alder: " + alder + " år.";

        JOptionPane.showMessageDialog(null, melding);
    }
}
