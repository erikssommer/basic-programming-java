package aritmetikk;

public class Oppgave2 {
    public static void main(String[] args) {
        int antall = 0;
        antall = antall + 2;
        System.out.print(antall + ", ");
        antall += 2;
        System.out.print(antall + ", ");
        antall += 2;
        System.out.print(antall + ", ");
        antall += 2;
        System.out.println(antall);

        System.out.println();

        //Kan alternativt gjøres med en for-løkke
        for (int i = 2; i < 10; i+= 2){
            System.out.print(i + ", ");
        }
    }
}
