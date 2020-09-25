package oblig1;

public class Vare {
    private String navn;
    private int antall;
    private double pris;

    // Konstruktør med alle attributter

    public Vare(String navn, int antall, double pris) {
        this.navn = navn;
        setAntall(antall);
        setPris(pris);
    }

    // get / set metoder
    // antall og pris må være større enn null

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        if (antall > 0){
            this.antall = antall;
        }
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        if (pris > 0){
            this.pris = pris;
        }
    }

    // metode for å beregne totalpris (pris * antall)
    public double totalpris(){
        return this.pris * this.antall;
    }
}
