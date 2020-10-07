package arrays1;

public class Oppgave4 {
    public static void main(String[] args) {
        int [] liste = {45, 34, 5, 8, 10, 2, 13, 25};

        for (int i = liste.length-1; i >= 0; i--){
            if (i > 0){
                System.out.print(liste[i] + ", ");
            }else {
                System.out.print(liste[i]);
            }
        }
    }
}
