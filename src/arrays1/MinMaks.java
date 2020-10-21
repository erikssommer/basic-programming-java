package arrays1;

public class MinMaks {
    public static void main(String[] args) {
        int [] liste ={3,-1,9,0,34,-6,8};

        System.out.println("Største tallet er " + maks(liste));
        System.out.println("Minste tallet er " + min(liste));
    }

    public static int min(int[] innArray){
        int minste = innArray[0];
        for (int tall : innArray){
            if (tall < minste){
                minste = tall;
            }
        }
        return minste;
    }

    public static int maks(int[] innArray){
        int storste = innArray[0];
        for (int tall : innArray){
            if (tall > storste){
                storste = tall;
            }
        }
        return storste;
    }
}
