package arrays1;

public class Oppgave5 {
    public static void main(String[] args) {
        int [] liste = {45, 34, 5, 50, 10, 2, 13, 25}; //Endret litt på listen

        int storste = liste[0];  // lat som første tallet er det største
        int minste = liste[0];   // lat som det første tallet også er det minste

        for (int i : liste){
            if (i > storste){
                storste = i;
            }else if (i < minste){
                minste = i;
            }
        }

        System.out.println("Det største tallet i listen er " + storste);
        System.out.println("Det minste talllet i listen er " + minste);
    }
}
