package kontrollstrukturer2.vanskelige;

import javax.swing.*;

public class Oppgave3_1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall: "));
        int c = 0;
        String primtall = " er et primtall!";

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                c++;
            }
            if (c > 2){
                primtall = " er ikke et primtall!";
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Tallet " + n + primtall);
    }
}
