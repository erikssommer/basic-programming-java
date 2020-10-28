package meromklasserogobjekter1;

public class MotorvognReg {
    public static void main(String[] args) {
        Bil[] register = new Bil[100];

        Dato dato1 = new Dato(1,3,2015);

        Bil volvo = new Bil("Vovlo T5",dato1,"DP23456");

        Dato dato2 = new Dato(4,10,2016);

        Bil audi = new Bil("Audi R8",dato2,"DR45678");

        register[0] = volvo;
        register[1] = audi;

        for (Bil enBil : register){
            if(enBil != null){
                System.out.println(enBil);
                System.out.println("-----");
            }
        }
    }
}
