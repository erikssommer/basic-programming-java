package javaFXoppgaver;

import java.util.ArrayList;

public class Parkeringshus {
    // opprett arrayet av biler
    public ArrayList<Bil> liste = new ArrayList<>();

    public void reserverPlass(Bil enBil){
        // legg bilen i arrayet
        liste.add(enBil);
    }

    public String frigjørPlass(String bilNummeret){
        /*
         ** må finne bilen i arrayet
         ** når den er funnet slett den fra arrayet
         ** og formater kvitteringen som returneres
         ** dersom bilen ikke finnes skal man returnere en passenede tekst
         */
        for (Bil bil : liste){
            if (bil.bilNummer.equals(bilNummeret)){
                liste.remove(bil);
                return bil.formaterKvittering();
            }
        }
        return "Fant ikke bilen i listen!";
    }
}
