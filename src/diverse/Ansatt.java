package diverse;

import meromklasserogobjekter1.Dato;

public class Ansatt {
    private String navn;
    private Dato fodt;
    private Dato tiltrodt;

    public Ansatt(String navn, Dato fodt, Dato tiltrodt){
        this.navn = navn;
        this.fodt = fodt;
        this.tiltrodt = tiltrodt;
    }

    @Override
    public String toString(){
        return "Ansatt med navn " + navn + " er født " + fodt + " og tiltrådte " + tiltrodt;
    }
}
