package arrays1;

public class Oppgave6 {
    public static void main(String[] args) {
        int [] liste1 = {45, 34, 5, 8, 10, 2, 13, 25};
        int [] liste2 = {45, 34, 5, 8, 10, 2, 13, 25};

        if (liste1.length != liste2.length){
            System.out.println("Arrayene er ikke like! De har forskjellig lengde!");
        } else{
            boolean like = true;
            for (int i = 0; i < liste1.length; i++){
                if (liste1[i] != liste2[i]) {
                    like = false;
                    break;
                }
            }
            if(like){
                System.out.println("Arrayene er like");
            }
            else{
                System.out.println("Arrayene er like lange, men har forskjellige elementer");
            }
        }
    }
}
