package grensesnitt;

public class Student implements Person{
    private String navn;

    public Student(String navn){
        this.navn = navn;
    }

    public Student(){}

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
        return "Student med navn " + navn;
    }
}
