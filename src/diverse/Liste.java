package diverse;

public class Liste {

    public static int storreEnnNull(int[] liste){
        int teller = 0;
        for (int i : liste){
            if (i > 0){
                teller++;
            }
        }
        return teller;
    }

    public static int forekomster(int[] liste, int tallet){
        int teller = 0;
        for (int i : liste){
            if (i == tallet){
                teller++;
            }
        }
        return teller;
    }

    public static int storst(int[] liste){
        int storst = liste[0];

        for (int i : liste){
            if (i > storst){
                storst = i;
            }
        }
        return storst;
    }

}
