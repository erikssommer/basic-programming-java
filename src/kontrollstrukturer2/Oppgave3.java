package kontrollstrukturer2;

public class Oppgave3 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i+=2){
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < 20; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
