package javaFXoppgaver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bil {
    public String bilNummer;
    public Date startTid;
    public int plass;
    public boolean kortTid; // true = korttids parkering

    public Bil(String bilNummer, Date startTid, boolean kortTid) {
        this.bilNummer = bilNummer;
        this.startTid = startTid;
        this.kortTid = kortTid;
    }

    public String formaterKvittering(){
        // formater kvitteringen etter oppgitt format
        String startDatoTid = new SimpleDateFormat("dd.MM.YYYY HH:mm").format(startTid);
        String na = new SimpleDateFormat("dd.MM.YYYY HH:mm").format(new Date());
        return "Kvittering for bilreg: " + bilNummer + "\nStartid: " + startDatoTid + " til " + na + "\n" +
                "Betalt " + avgift() + "kr";
    }

    public double getPris(){
        // returner 10 eller 20 kroner avhengig av kortTid eller ikke
        if (kortTid){
            return 20;
        }else {
            return 10;
        }
    }
    public double avgift(){
        // regner ut tiden som er gått i timer og ganger med prisen
        Date na = new Date();
        double varighet = na.getTime() - startTid.getTime();
        int timer = (int)varighet / 10_000;
        return timer * getPris();
    }
}
