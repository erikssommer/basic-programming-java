package arv;

public class Student extends Person{
    private String studium;
    private int studentnr;

    public Student(String navn, int alder, String email, String studium, int studentnr) {
        super(navn, alder, email);
        this.studium = studium;
        this.studentnr = studentnr;
    }

    public String getStudium() {
        return studium;
    }

    public void setStudium(String studium) {
        this.studium = studium;
    }

    public int getStudentnr() {
        return studentnr;
    }

    public void setStudentnr(int studentnr) {
        this.studentnr = studentnr;
    }

    @Override
    public String getSkole() {
        return "OsloMet";
    }

    @Override
    public void skirvSkole() {
        System.out.println(getSkole());
    }

    @Override
    public String toString() {
        return "Student: \n" + super.toString() + ", studium: " + studium + ", studentnummer: " + studentnr + "\n";
    }
}
