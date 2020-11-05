package diverse;

import meromklasserogobjekter1.Dato;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] liste = {-3, 41, 5, -3, 2, 49};

        System.out.println(Liste.storreEnnNull(liste));
        System.out.println(Liste.forekomster(liste, -3));
        System.out.println(Liste.storst(liste));

        //-------------

        ArrayList<Ansatt> ansattListe = new ArrayList<>();

        Ansatt tove = new Ansatt("Tove", new Dato(2,6,1987), new Dato(7, 4, 2015));
        Ansatt markus = new Ansatt("Markus", new Dato(6,1,1999), new Dato(1, 4, 2020));

        ansattListe.add(tove);
        ansattListe.add(markus);

        for (Ansatt ansatt : ansattListe){
            System.out.println(ansatt);
        }
    }
}
