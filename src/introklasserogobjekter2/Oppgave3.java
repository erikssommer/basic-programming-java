package introklasserogobjekter2;

public class Oppgave3 {
    public static void main(String[] args) {
        Bensinkjop bensinkjop = new Bensinkjop("Oslo", "Diesel", 53, 12.43, "09:35");

        double pris = bensinkjop.finnTotalPrisen();

        String prisToDesimaler = String.format("%.2f", pris);
        String ut = "Det kostet totalt " + prisToDesimaler+" kr i " + bensinkjop.getSted() +
                " kl " + bensinkjop.getTidspunkt();

        System.out.println(ut);
    }
}
