package oving39;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Erik", "Sommer", "Oslo 23", "34567890", 0);
        //Nettopp født
        person.skrivUt();
        //Går det 10år
        person.setAlder(10);
        person.skrivUt();
        //Jeg gifter meg nå jeg er 40år
        person.setAlder(40);
        person.setEtternavn("Vinter");
        person.skrivUt();
    }
}
