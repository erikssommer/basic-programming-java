package introklasserogobjekter2;

import static javax.swing.JOptionPane.showMessageDialog;

public class Konto {
    //  Attributtene for kontoinnehavers navn, kontornummer og saldo.
    private String navn;
    private String kontonummer;
    private double saldo;

    //  Kontruktør som skal gi startverdier til ALLE attributtene
    public Konto(String navn, String kontonummer, double saldo) {
        this.navn = navn;
        this.kontonummer = kontonummer;
        this.saldo = saldo;
    }

    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
       navn, kontonummer og saldo i et dialogvindu. */

    public void utskrift(){
        String ut = "Kontoinnehaver : " + navn + "\n"+
                "Kontonummer : " + kontonummer + "\n"+
                "Saldo : " + String.format("%.2f", saldo) + " kr";
        showMessageDialog(null, ut);
    }

    /*  Metode som setter inn et beløp på kontoen.
        Beløpets størrelse skal tas imot via en parameter til metoden.
        Metoden skal returnere en tekst som inneholder informasjon om
        den nye saldoen.  */

    public String settInn(double belop){
        saldo = saldo + belop;
        return "Den nye saldoen er : "+String.format("%.2f", saldo)+" kr";
    }

    /*  Metode som tar ut et beløp fra kontoen, under forutsetning av
        at det er dekning for beløpet.
        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
        Hvis det er dekning på kontoen, skal metoden returnere en tekst
        med informasjon om den nye saldoen. Hvis detikke er dekning,
        skal den returnerte teksten inneholde informasjon om det. */

    public String taUt(double belop) {
        String ut;
        if (belop <= saldo) {
            saldo = saldo - belop;
            ut = "Den nye saldoen er : " + String.format("%.2f", saldo) + " kr";
        } else {
            ut = "Ikke dekning på konto";
        }
        return ut;
    }

}
