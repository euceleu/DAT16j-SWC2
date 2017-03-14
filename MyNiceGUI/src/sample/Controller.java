package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button myButton2;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (myButton2.getText().equals("Alice")) {
            myButton2.setText("Sigita");
        } else {
            myButton2.setText("Alice");
        }
    }
}
