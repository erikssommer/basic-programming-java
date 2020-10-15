package oving42;

import javax.swing.*;

public class For {
    public static void main(String[] args) {
        String[] liste = {"Lisa", "Knut", "Ola"};

        String navn = JOptionPane.showInputDialog("Finn ut om navnet er i listen");

        for (String i : liste){
            if (i.equals(navn)){
                System.out.println(i);
                break;
            }
        }

        for (int i = 0; i < liste.length; i++){
            if (liste[i].equals(navn)){
                System.out.println(i);
                break;
            }
        }
    }
}
