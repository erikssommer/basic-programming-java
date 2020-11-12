package grensesnitt;

public class Ansatt implements Person{
    private String navn;

    public Ansatt(String navn){
        this.navn = navn;
    }

    public Ansatt(){}

    @Override
    public String getnavn() {
        return navn;
    }

    @Override
    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString(){
        return "Ansatt med navn " + navn;
    }
}
