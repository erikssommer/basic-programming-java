package kontrollstrukturer2.vanskelige;

public class Oppgave2_2 {
    public static void main(String[] args) {

        int intervall = 100;

        for (int i = 0; i < intervall; i++){
            if (primtallTest(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean primtallTest(int tall){

        if (tall <= 1){
            return false;
        }

        for (int i = 2; i < tall; i++){
            if (tall % i == 0){
                return false;
            }
        }
        return true;
    }
}
