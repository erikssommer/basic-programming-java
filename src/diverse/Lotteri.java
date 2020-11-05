package diverse;

public class Lotteri {
    public static final int MAKS_ANTALL = 1000;
    public int antallSolgte = 0;
    public Lodd[] loddbok = new Lodd[MAKS_ANTALL];

    public boolean kjopLodd(Lodd nyttLodd){
        for (int i = 0; i < loddbok.length; i++){
            if (loddbok[i] != null){
                loddbok[i] = nyttLodd;
                return true;
            }
        }
        return false;
    }

    public String trekkVinner(){
        int vinner = (int) (Math.random() * antallSolgte);
        return loddbok[vinner].toString();
    }
}
