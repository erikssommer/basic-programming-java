package arrays1;

public class Oppgave3 {
    public static void main(String[] args) {
        String [] navn = {"Per","Hansen","Line","Olsen","Ola","Pedersen","Kari","Finnsen"};

        for (int i = 0; i < navn.length; i+=2) {
            System.out.println(navn[i] + " " + navn[i+1]);
        }
    }
}
