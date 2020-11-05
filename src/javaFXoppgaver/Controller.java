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
        lblAvgift.setText(parkeringshus.frigjorPlass(txtBilnummer.getText()));
    }

    @FXML
    void startKortTid(ActionEvent event) {
        // opprett en bil
        // og kall på reserver plass
        Bil enBil = new Bil(txtBilnummer.getText(), new Date(), true);
        parkeringshus.reserverPlass(enBil);
    }

    @FXML
    void startLangTid(ActionEvent event) {
        // opprett en bil
        // og kall på reserver plass
        Bil enBil = new Bil(txtBilnummer.getText(), new Date(), false);
        parkeringshus.reserverPlass(enBil);
    }
}
