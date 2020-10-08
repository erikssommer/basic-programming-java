package oving41;

public class Oppgave6 {
    public static void main(String[] args) {
        int[] liste1 = {3,4,5,2,1};
        int[] liste2 = {3,4,5,2,1};

        if (liste1.length != liste2.length){
            System.out.println("Listene er ikke like! De har forskjellig lengde!");
        } else {
            boolean like = true;
            for (int i = 0; i < liste1.length; i++){
                if (liste1[i] != liste2[i]){
                    like = false;
                    break;
                }
            }

            if (like){
                System.out.println("Listene er like!");
            }else {
                System.out.println("Listene er av samme lengde, men har ikke like verdier");
            }
        }
    }

    public static boolean test(int[] liste1, int[] liste2){
        for (int i = 0; i < liste1.length; i++){
            if (liste1[i] != liste2[i]){
                return false;
            }
        }
        return true;
    }
}
