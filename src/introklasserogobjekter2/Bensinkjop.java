package introklasserogobjekter2;

public class Bensinkjop {
    private String sted;
    private String type;
    private double antallLiter;
    private double prisPrLiter;
    private String tidspunkt;

    public Bensinkjop(String sted, String type, double antallLiter, double prisPrLiter, String tidspunkt) {
        this.sted = sted;
        this.type = type;
        this.antallLiter = antallLiter;
        this.prisPrLiter = prisPrLiter;
        this.tidspunkt = tidspunkt;
    }

    public String getSted() {
        return sted;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAntallLiter() {
        return antallLiter;
    }

    public void setAntallLiter(double antallLiter) {
        this.antallLiter = antallLiter;
    }

    public double getPrisPrLiter() {
        return prisPrLiter;
    }

    public void setPrisPrLiter(double prisPrLiter) {
        this.prisPrLiter = prisPrLiter;
    }

    public String getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public double finnTotalPrisen(){
        return this.antallLiter * this.prisPrLiter;
    }
}
