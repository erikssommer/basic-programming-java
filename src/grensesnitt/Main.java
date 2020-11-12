package grensesnitt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> liste = new ArrayList<>();

        Person student = new Student("Markus");
        Person ansatt = new Ansatt("Mari");

        liste.add(student);
        liste.add(ansatt);

        for (Person person : liste){
            System.out.println(person);
        }
    }
}
