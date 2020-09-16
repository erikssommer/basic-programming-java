package introklasserogobjekter1;

public class Oppgave3 {
    public static void main(String[] args) {
        Person enPerson = new Person();
        enPerson.navn = "Jan";
        enPerson.telefonnr = "5678900809";
        enPerson.adresse = "Osloveien 23";
        enPerson.fodselsar = 1989;

        int alder = enPerson.finnAlder();

        enPerson.skrivUtOppgave3(alder);
    }
}
