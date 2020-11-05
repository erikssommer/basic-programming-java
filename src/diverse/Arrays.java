package diverse;

public class Arrays {
    public static void main(String[] args) {

        int teller = 1;
        while (teller <= 25) {
            System.out.println(teller);
            teller++;
        }

        for (int i = 1; i <= 25; i++) {
            System.out.println(i);
        }

        int[] liste = {-3, 41, 5, -3, 2, 49};

        int teller2 = 0;
        for (int i : liste) {
            if (i > 10) {
                teller2++;
            }
        }
        System.out.println(teller2);

        for (int i = 0; i < liste.length; i += 2) {
            System.out.println(i);
        }

        int sum = 0;
        int teller3 = 0;
        for (int tall : liste) {
            if (tall >= 0) {
                sum += tall;
                teller3++;
            }
        }
        System.out.println(sum);
        System.out.println(sum / teller3);

    }
}
