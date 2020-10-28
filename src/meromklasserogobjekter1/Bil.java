package meromklasserogobjekter1;

public class Bil {
    public String typeBetegnelse;
    public Dato forstegangsRegistert;
    public String kjennetegn;

    public Bil(String typeBetegnelse, Dato forstegangsRegistrert, String kjennetegn){
        this.typeBetegnelse = typeBetegnelse;
        this.forstegangsRegistert = forstegangsRegistrert;
        this.kjennetegn = kjennetegn;
    }

    public String toString(){
        String ut = "Typebetegnelse : " + typeBetegnelse + "\n" +
                "Første gangs registreringsdato : " + forstegangsRegistert + "\n" +
                "Kjennetegn : " + kjennetegn;
        return ut;
    }
}
