package javaFXoppgaver;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Date;

public class Controller {
    // opprett parkeringshuset
    Parkeringshus parkeringshus = new Parkeringshus();

    @FXML
    private Label lblAvgift;

    @FXML
    private TextField txtBilnummer;

    @FXML
    void kjorUt(ActionEvent event) {
        // kall frigjør plass og legg ut kvitteringen i lblAvgift
        lblAvgift.setText(parkeringshus.frigjørPlass(txtBilnummer.getText()));
    }

    @FXML
    void startKortTid(ActionEvent event) {
        // opprett en bil
        // og kall på reserver plass
        Date na = new Date();
        Bil bil = new Bil(txtBilnummer.getText(), na, true);
        parkeringshus.reserverPlass(bil);
    }

    @FXML
    void startLangTid(ActionEvent event) {
        // opprett en bil
        // og kall på reserver plass
        Date na = new Date();
        Bil bil = new Bil(txtBilnummer.getText(), na, false);
        parkeringshus.reserverPlass(bil);
    }
}
