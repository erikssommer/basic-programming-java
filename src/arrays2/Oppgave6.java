package arrays2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave6 {
    public static void main(String[] args) {

        String innAnmeldere = showInputDialog("Hvor mange anmeldere?");
        int antallAnmeldere;

        try{
            antallAnmeldere = Integer.parseInt(innAnmeldere);
        } catch(Exception e){
            antallAnmeldere = 0;
        }

        String innFilmer = showInputDialog("Hvor mange filmer?");
        int antallFilmer;

        try{
            antallFilmer = Integer.parseInt(innFilmer);
        } catch(Exception e){
            antallFilmer = 0;
        }

        if (antallFilmer == 0 || antallAnmeldere == 0){
            showMessageDialog(null, "Programmet stoppes, ikke angitt korrekt informasjon");
        }else{
            //Lag arrayet
            int[][] matrise = new int [antallAnmeldere][antallFilmer];
            //Les inn verdiene via dobbel forløkke
            String innScore;
            int score;
            for (int i = 0; i < antallAnmeldere; i++){
                for (int j = 0; j < antallFilmer; j++){
                    innScore = showInputDialog("Skriv inn score for anmelder " + (i+1) + " og film " + (j+1) + " (0-9)");
                    try{
                        score = Integer.parseInt(innScore);
                        if (score >= 0 && score <= 9){
                            matrise[i][j] = score;
                        }
                    }
                    catch(Exception e){
                        showMessageDialog(null,"Ikke gyldig input, ignorert dette");
                    }
                }
            }

            //Skriver ut for å sjekke
            String ut = "";
            for (int i = 0; i < antallAnmeldere; i++){
                ut += "Anmelder " + (i+1) + " : ";
                for (int j = 0; j < antallFilmer; j++){
                    ut += matrise[i][j] + " ";
                }
                ut += "\n";
            }
            System.out.println(ut);

            //Gennomsnitt for filmene:
            double snitt;
            ut = "Gjennomsnittet er: \n";

            for (int i = 0; i < antallFilmer; i++){
                snitt = 0;

                for (int j = 0; j < antallAnmeldere; j++){
                    snitt += matrise[j][i];
                }

                snitt = snitt / antallAnmeldere;
                ut += "Film " + (i+1) + " : " + String.format("%.2f", snitt) + "\n";
            }
            System.out.println(ut);
        }
    }
}
