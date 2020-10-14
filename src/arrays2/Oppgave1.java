package arrays2;

import java.util.ArrayList;

public class Oppgave1 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();

        for (int i = 1; i < 10; i++){
            liste.add(i);
        }

        System.out.println("Element nr 3 : " + liste.get(3));
        System.out.println("Element nr 6 : " + liste.get(6));
    }
}
