package kontrollstrukturer2.vanskelige;

import javax.swing.*;

public class Oppgave3_2 {
    public static void main(String[] args) {
        int tallet = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn tallet du vil teste om er et primtall: "));

        if (primtallTest(tallet)){
            JOptionPane.showMessageDialog(null, tallet + " er et primtall");
        } else{
            JOptionPane.showMessageDialog(null, tallet + " er ikke et primtall");
        }
    }

    public static boolean primtallTest(int tall){

        if (tall <= 1){
            return false;
        }

        for (int i = 2; i < tall; i++){
            if (tall % i == 0){
                return false;
            }
        }
        return true;
    }
}
