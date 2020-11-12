package arv;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personListe = new ArrayList<>();

        Person student = new Student("Ola", 25, "ola@nordmann.no", "IT", 12345);
        Person ansatt = new Ansatt("Julie", 34, "julie@uni.no", "Sykepleie", 54321);

        personListe.add(student);
        personListe.add(ansatt);

        for (Person enPerson : personListe){
            enPerson.skirvSkole();
            System.out.println(enPerson);
        }
    }
}
