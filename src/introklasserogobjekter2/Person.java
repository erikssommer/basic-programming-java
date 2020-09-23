package introklasserogobjekter2;

import static javax.swing.JOptionPane.showMessageDialog;

public class Person {
    //Private atributter
    private String fornavn;
    private String etternavn;
    private String adresse;
    private String telefonnr;

    //Konstruktør med alle atributtene
    public Person(String fornavn, String etternavn, String adresse, String telefonnr) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    //get/set-metoder for hver enkelt atributt
    //get-metoder returnerer verdien til atributten. Tar ikke inn noen parametere
    //set-metoden setter atributten til en ny verdi. Tar inn ny verdi som parameter
    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
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

    //Andre metoder som utfører oppgaver

    public void skrivUt(){
        String ut = "Navn : "+fornavn+" "+etternavn+"\n"+
                "Adresse : "+adresse+"\n"+
                "Telefonnr : "+telefonnr+"\n";
        showMessageDialog(null,ut);
    }
}
