package arrays1;

public class BineareSok {

    public static int indeks(int[] liste, int nokkel) {
        int lav = 0;
        int hoy = liste.length - 1;
        while (lav <= hoy) {
            int middel = lav + (hoy - lav) / 2;
            if (nokkel < liste[middel]){
                hoy = middel - 1;
            }
            else if (nokkel > liste[middel]){
                lav = middel + 1;
            }
            else{
                return middel;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int [] primtall = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
                41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        // NB: Må være en liste som er sortert stigende!
        System.out.println("Tallet 43 er et primall " + indeks(primtall,43));
        System.out.println("Tallet 42 er ikke et primall " + indeks(primtall,42));
    }
}
