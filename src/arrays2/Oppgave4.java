package arrays2;

import java.util.ArrayList;

public class Oppgave4 {
    public static void main(String[] args) {
        ArrayList<Integer> liste1 = new ArrayList<>();

        for (int i = 1;i < 10; i++){
            liste1.add(i);
        }

        int [] liste2 = new int[liste1.size()];

        for (int i = 0; i < liste1.size(); i++){
            liste2[i] = liste1.get(i);
        }

        for (int i : liste2) {
            System.out.print(i + " ");
        }
    }
}
