package javaFXoppgaver;

import java.util.ArrayList;

public class Parkeringshus {
    // opprett arrayet av biler
    private ArrayList<Bil> billiste = new ArrayList<>();

    public void reserverPlass(Bil enBil){
        // legg bilen i arrayet
        billiste.add(enBil);
    }

    public String frigjorPlass(String bilNummeret){
        /*
         ** må finne bilen i arrayet
         ** når den er funnet slett den fra arrayet
         ** og formater kvitteringen som returneres
         ** dersom bilen ikke finnes skal man returnere en passenede tekst
         */
        for (Bil enBil : billiste){
            if (enBil.bilNummer.equals(bilNummeret)){
                billiste.remove(enBil);
                return enBil.formaterKvittering();
            }
        }
        return "Bilen er ikke å finne i systemet";
    }
}
