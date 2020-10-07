package arrays1;

public class Oppgave7 {
    public static void main(String[] args) {
        int [] liste = {45, 34, 5, 8, 10, 2, 13, 25};

        int partall = 0;
        int oddetall = 0;

        for (int i : liste) {
            if(i % 2 == 0 ){
                partall ++;
            }
            else {
                oddetall ++;
            }
        }

        System.out.println("Listen inneholder " + partall + " partall");
        System.out.println("Listen inneholder " + oddetall + " oddetall");
    }
}
