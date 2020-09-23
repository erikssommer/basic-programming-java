package oving39;

public class Person {
    private String fornavn;
    private String etternavn;
    private String adresse;
    private String telefonnr;
    private int alder;

    public Person(String fornavn, String etternavn, String adresse, String telefonnr, int alder){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
        setAlder(alder);
    }

    public String getFornavn(){
        return fornavn;
    }

    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }

    public String getEtternavn(){
        return etternavn;
    }

    public void setEtternavn(String etternavn){
        this.etternavn = etternavn;
    }

    public String getAdresse(){
        return adresse;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public String getTelefonnr(){
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr){
        this.telefonnr = telefonnr;
    }

    public int getAlder(){
        return alder;
    }

    public void setAlder(int alder){
        if (alder >= 0 && alder <= 130){
            //Korrekt alder
            this.alder = alder;
        }else {
            System.out.println("Alderen er ugyldig. Den blir nå satt til 0");
            this.alder = 0;
        }
    }

    //Ferdig med get/set-metoder

    //Andre metoder til klassen

    public void skrivUt(){
        System.out.println(this.fornavn + " " + this.etternavn + " " + this.adresse + " " + this.telefonnr + " " + this.alder);
    }

}
