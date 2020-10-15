package oving42;

public class Oppgave1 {
    public static void main(String[] args) {
        int[][] matrise = {{4,6,2,5},{7,9,4,8},{6,9,3,7}};

        //Skriver ut matrisen
        String ut = "";
        for (int i = 0; i < 3; i++){
            ut += "Anmelder nr."+(i+1)+": ";
            for (int j = 0; j < 4; j++){
                ut += matrise[i][j] + " ";
            }
            ut += "\n";
        }

        System.out.println(ut);

        double snitt;
        ut = "Gjennomsnittet er: \n";
        for (int i = 0; i < 4; i++){
            snitt = 0;
            for (int j = 0; j < 3; j++){
                snitt += matrise[j][i];
            }
            snitt = snitt / 3;
            ut += "Film nr." + (i+1) + " : " + String.format("%.2f", snitt) + "\n";
        }

        System.out.println(ut);
    }
}
