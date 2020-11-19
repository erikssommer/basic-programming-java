package oving;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.util.ArrayList;

class Person{
    // attributtene til klassen
    public String navn;
    public String personnummer;

    // konstruktør for å initialisere attributtene til klassen
    public Person(String navn, String personnummer){
        this.navn = navn;
        this.personnummer = personnummer;
    }
}

class Register{
    private ArrayList<Person> personregister = new ArrayList<>();

    public void registrerPerson(String navn, String personnummer){
        /* sjekk om personnummeret finnes fra før
           dersom det ikke gjør det registrer det */
        if (!finnesFraFor(personnummer)){
            Person person = new Person(navn, personnummer);
            personregister.add(person);
        }
    }

    public void slettPerson(String personnummer){
        /* løp igjennom arrayet for å finne personen,
           dersom den finnes, slett den */
        for (Person person : personregister){
            if (person.personnummer.equals(personnummer)){
                personregister.remove(person);
                break;
            }
        }
    }

    public boolean finnesFraFor(String personnummer){
        /* sjekk om personnummeret allerede ligger i arrayet
           dersom det gjør det returner true, ellers false */
        for (Person person : personregister){
            if (person.personnummer.equals(personnummer)){
                return true;
            }
        }
        return false;
    }

    public String visAllePersonene(){
        /* løp igjennom arrayet og formater først personnummer så navn på
           hver sin linje i en streng og returner denne. */
        String melding = "";
        for (Person person : personregister){
            melding += "Personnummer: " + person.personnummer + ", navn: " + person.navn + "\n--------\n";
        }
        return melding;
    }
}

public class Controller {

    Register register = new Register();

    @FXML
    private Label lblRegister; // Metode setText();

    @FXML
    private TextField txtnavn; // Metode getText();

    @FXML
    private TextField txtPersonnummer; // Metode getText();

    @FXML
    void registrer(ActionEvent event) {
        if (!txtnavn.getText().isEmpty() && !txtPersonnummer.getText().isEmpty()){
            register.registrerPerson(txtnavn.getText(), txtPersonnummer.getText());
            lblRegister.setText(register.visAllePersonene());
        }else {
            lblRegister.setText("Du har glemt å oppgi informasjon. Prøv på nytt!");
        }
    }

    //main-metoden er bare for å teste ettersom vi ikke har laget fxml-filen
    public static void main(String[] args) {
        Register register = new Register();
        register.registrerPerson("Nina", "123456");
        register.registrerPerson("Trump", "123457");
        register.slettPerson("123457");
        register.registrerPerson("Emilie", "123458");
        JOptionPane.showMessageDialog(null, register.visAllePersonene());
    }

    @FXML
    void slett(ActionEvent event) {
        if (!txtPersonnummer.getText().isEmpty()){
            register.slettPerson(txtPersonnummer.getText());
            lblRegister.setText(register.visAllePersonene());
        }
    }
}
