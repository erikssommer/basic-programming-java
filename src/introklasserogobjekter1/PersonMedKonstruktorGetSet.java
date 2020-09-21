package introklasserogobjekter1;

/**
 * Ettersom konstruktør og get/set-metoder er en del av obligen, men som ikke blir gjennomført før senere, så kan dette
 * være et godt eksempel på hvordan det gjøres.
 */

public class PersonMedKonstruktorGetSet {
    //Private atributter
    private String navn;
    private String adresse;
    private String telefonnr;
    private int fodselsar;

    //Konstruktør med alle atributtene
    public PersonMedKonstruktorGetSet(String navn, String adresse, String telefonnr, int fodselsar) {
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
        this.fodselsar = fodselsar;
    }

    //get/set-metoder for hver enkelt atributt
    //get-metoder returnerer verdien til atributten. Tar ikke inn noen parametere
    //set-metoden setter atributten til en ny verdi. Tar inn ny verdi som parameter
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public int getFodselsar() {
        return fodselsar;
    }

    public void setFodselsar(int fodselsar) {
        this.fodselsar = fodselsar;
    }

    //Andre metoder som utfører oppgaver
}
