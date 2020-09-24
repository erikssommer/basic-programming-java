package introklasserogobjekter2;

import static javax.swing.JOptionPane.showMessageDialog;

public class Person {
    //Private atributter
    private String fornavn;
    private String etternavn;
    private String adresse;
    private String telefonnr;

    public Person(String fornavn, String etternavn, String adresse, String telefonnr) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

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
        String ut = "Navn : "+this.fornavn+" "+this.etternavn+"\n"+
                "Adresse : "+this.adresse+"\n"+
                "Telefonnr : "+this.telefonnr+"\n";
        showMessageDialog(null,ut);
    }
}
