package oving42;

import javax.swing.*;

public class Oppgave6 {
    public static void main(String[] args) {
        int antallFilmer;
        int antallAndmeldere;

        String innAndmeldere = JOptionPane.showInputDialog("Antall andmeldere");

        try {
            antallAndmeldere = Integer.parseInt(innAndmeldere);
        }catch (Exception e){
            antallAndmeldere = 0;
        }

        String innFilmer = JOptionPane.showInputDialog("Antall filmer");

        try {
            antallFilmer = Integer.parseInt(innFilmer);
        }catch (Exception e){
            antallFilmer = 0;
        }

        if (antallAndmeldere == 0 || antallFilmer == 0){
            JOptionPane.showMessageDialog(null, "Det har blitt lest inn noe feil. Programmet slutter");
        } else {
            int[][] matrise = new int[antallAndmeldere][antallFilmer];

            int score;
            String innScore;
            for (int i = 0; i < antallAndmeldere; i++){
                for (int j = 0; j < antallFilmer; j++){
                    innScore = JOptionPane.showInputDialog("Skriv inn score for andmelder nr."+(i+1)+ " for film nr."+(j+1)+ ": (0-9)");
                    try {
                        score = Integer.parseInt(innScore);
                        if (score >= 0 && score <= 9){
                            matrise[i][j] = score;
                        }
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null, "Feil score ble skrevet inn, ignorerer dette");
                    }
                }
            }

            //Skriver ut matrisen
            String ut = "";
            for (int i = 0; i < antallAndmeldere; i++){
                ut += "Anmelder nr."+(i+1)+": ";
                for (int j = 0; j < antallFilmer; j++){
                    ut += matrise[i][j] + " ";
                }
                ut += "\n";
            }

            System.out.println(ut);

            double snitt;
            ut = "Gjennomsnittet er: \n";
            for (int i = 0; i < antallFilmer; i++){
                snitt = 0;
                for (int j = 0; j < antallAndmeldere; j++){
                    snitt += matrise[j][i];
                }
                snitt = snitt / 3;
                ut += "Film nr." + (i+1) + " : " + String.format("%.2f", snitt) + "\n";
            }

            System.out.println(ut);
        }
    }
}
