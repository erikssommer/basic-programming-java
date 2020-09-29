package kontrollstrukturer2;

public class Oppgave8 {
    public static void main(String[] args) {
        int sum = 0;
        int teller = 0;
        int i = 0;

        while (i < 100){
            sum += i;
            teller++;
            i+=2;
        }

        double snitt = (double) sum / (double) teller;

        System.out.println("Gjennomsnittet blir " + snitt);
    }
}
