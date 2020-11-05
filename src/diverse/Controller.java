package diverse;

import javafx.fxml.FXML;

import java.awt.*;

/**
 * Simulerer en javaFX controller
 */

public class Controller {
    private Lotteri lotteri = new Lotteri();

    @FXML
    private Label lblResultater;

    @FXML
    private TextField txtNavn, txtTelefonnr;

    @FXML
    public void regLoddslag(){
        Lodd lodd = new Lodd();
        lodd.navn = txtNavn.getText();
        lodd.telefonnr = txtTelefonnr.getText();

        boolean kjopLodd = lotteri.kjopLodd(lodd);

        if (!kjopLodd){
            lblResultater.setText("Det er ikke mulig å kjøpe flere lodd");
        }
    }

    @FXML
    public void foretaTrekning(){
        lblResultater.setText(lotteri.trekkVinner());
    }

    @FXML
    public void nyttLotteri(){
        lotteri = new Lotteri();
    }

}
