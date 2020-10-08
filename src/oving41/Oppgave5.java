package oving41;

public class Oppgave5 {
    public static void main(String[] args) {
        int[] liste = {45, 34, 5, 56, 10, 2, 13, 25};

        int storst = liste[0];
        int minste = liste[0];

        for (int i : liste){
            if (i > storst){
                storst = i;
            }
            if (i < minste){
                minste = i;
            }
        }
        /*
        for (int i = 0; i < liste.length; i++){
            if (liste[i] > storst){
                storst = liste[i];
            }
            if (liste[i] < minste){
                minste = liste[i];
            }
        }

         */


        System.out.println("Største verdi er " + storst);
        System.out.println("Minste verdi er " + minste);
    }
}
