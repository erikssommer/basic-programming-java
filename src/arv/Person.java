package arv;

public class Person {
    private String navn;
    private int alder;
    private String email;

    public Person(String navn, int alder, String email) {
        this.navn = navn;
        this.alder = alder;
        this.email = email;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Navn: " + navn + ", alder: " + alder + ", email: " + email;
    }
}
