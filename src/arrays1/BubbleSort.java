package arrays1;

public class BubbleSort {
    public static void boblesort(int[] liste) {
        int n = liste.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (liste[i] > liste[k]) {
                    swapNummer(i, k, liste);
                }
            }
            skrivNummer(liste);
        }
    }

    private static void swapNummer(int i, int j, int[] liste) {
        int temp = liste[i];
        liste[i] = liste[j];
        liste[j] = temp;
    }

    private static void skrivNummer(int[] liste) {
        for (int tall: liste) {
            System.out.print(tall + ", ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        boblesort(input);
    }
}
