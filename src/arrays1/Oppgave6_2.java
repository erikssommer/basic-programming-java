package arrays1;

/*
 * Løsning hvor sammenlikningen skjer i en egen metode.
 */

public class Oppgave6_2 {
    public static void main(String[] args) {
        int [] liste1 = {45, 34, 5, 8, 10, 2, 13, 25};
        int [] liste2 = {45, 34, 5, 9, 10, 2, 13, 25};

        if (liste1.length != liste2.length){
            System.out.println("Arrayene er ikke like! De har forskjellig lengde!");
        } else{
            if(likeVerdier(liste1, liste2)){
                System.out.println("Arrayene er like");
            }
            else{
                System.out.println("Arrayene er like lange, men har forskjellige elementer");
            }
        }
    }

    public static boolean likeVerdier(int[] liste1, int[] liste2){
        for (int i = 0; i < liste1.length; i++){
            if (liste1[i] != liste2[i]) {
                return false;
            }
        }
        return true;
    }
}
