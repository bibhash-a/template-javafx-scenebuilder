package yourGroupIDTheOneWithCom;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		// With SceneBuilder:
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene myScene = new Scene(root);
		primaryStage.setScene(myScene);
		primaryStage.show();
	}
}

/*
 * Without SceneBuilder: 
 * GridPane myGrid = new GridPane(); 
 * Button myButton = new Button("I am a button!"); 
 * myGrid.add(myButton, 0, 0); 
 * Scene myScene = new Scene(myGrid, 450, 100); 
 */