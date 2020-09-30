package kontrollstrukturer2;

public class Oppgave4 {
    public static void main(String[] args) {
        int sum = 0;
        int teller = 0;

        for (int i = 0; i < 100; i++){
            if (i % 2 == 0){
                sum += i;
                teller++;
            }
        }

        double snitt = (double) sum / (double) teller;

        System.out.println("Gjennomsnittet blir: " + snitt);
    }
}
