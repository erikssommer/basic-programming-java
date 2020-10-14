package arrays2;

import java.util.ArrayList;

public class Oppgave3 {
    public static void main(String[] args) {
        int [] liste1 = {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> liste2 = new ArrayList<>();

        for (int i : liste1){
            liste2.add(i);
        }

        for (int i : liste2) {
            System.out.print(i + " ");
        }
    }
}
