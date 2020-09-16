package introklasserogobjekter1;

public class Oppgave1 {
    public static void main(String[] args) {
        Bok enBok = new Bok();
        enBok.tittel = "Java";
        enBok.pris = 239.9;
        enBok.forfatter = "Nesbo";
        enBok.isbn = "456789087654";

        enBok.skrivUtOppgave1();
    }
}
