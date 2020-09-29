package kontrollstrukturer2;

public class Oppgave4 {
    public static void main(String[] args) {
        int sum = 0;
        int teller = 0;

        for (int i = 0; i < 100; i+=2){
            sum += i;
            teller++;
        }

        double gjennomsnitt = (double) sum / (double) teller;

        System.out.println("Gjennomsnittet blir: " + gjennomsnitt);
    }
}
