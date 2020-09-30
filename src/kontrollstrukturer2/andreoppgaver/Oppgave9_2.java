package kontrollstrukturer2.andreoppgaver;

// Løsning med rekursjon. Det er ikke pensum, men velding kraftfullt.

public class Oppgave9_2 {
    public static void main(String[] args) {
        System.out.println(fak(3));
    }

    public static long fak(int a){
        if(a <= 1) {
            return 1;
        }

        return a * fak(a-1);
    }
}
