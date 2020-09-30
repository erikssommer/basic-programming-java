package kontrollstrukturer2;

// To måter å løse oppgaven på. Anbefaler den siste ettersom den ikke hopper over noen ledd i listen

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
