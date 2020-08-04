package yourGroupID;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {
    @FXML
    private Button myButton;

    @FXML
    private Label myLabel;

    @FXML
    void buttonClick(MouseEvent event) {
    	myLabel.setText("Button was clicked!");
    }
}
