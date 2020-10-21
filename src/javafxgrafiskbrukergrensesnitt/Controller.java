package javafxgrafiskbrukergrensesnitt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtBelop;

    @FXML
    private TextField txtRente;

    @FXML
    private TextField txtAntallAar;

    @FXML
    private Label lblResultat;

    @FXML
    private void beregn(ActionEvent event) {
        try{
            double belop = Double.parseDouble(txtBelop.getText());
            double rente = Double.parseDouble(txtRente.getText());
            int antallAar = Integer.parseInt(txtAntallAar.getText());

            double resultat = belop * Math.pow(1+(rente/100), antallAar);

            lblResultat.setText("Totalbeløpet etter " + antallAar + " år blir " + String.format("%.2f", resultat) + "kr");
        } catch(Exception e){
            lblResultat.setText("Skriv inn tall i alle feltene!");
        }
    }
}
