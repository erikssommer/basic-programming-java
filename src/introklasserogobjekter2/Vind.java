package introklasserogobjekter2;

public class Vind {
    private double vindhastighet;

    public Vind (double vindhastighet) {
        this.vindhastighet = vindhastighet;
    }

    public double getVindhastighet(){
        return vindhastighet;
    }

    public boolean erOrkan() {
        if (vindhastighet > 120.0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean erStille() {
        if (vindhastighet < 2.0){
            return true;
        }
        else{
            return false;
        }
    }

    public double getKnop() {
        return vindhastighet / 1.852;
    }

    public int getBeaufort() {
        int beaufort = (int) (Math.pow(vindhastighet / 3.01, 0.6666) +0.5);
        if (beaufort > 12) {
            beaufort = 12;
        }
        return beaufort;
    }
}
