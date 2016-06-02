package application;

import java.net.URL;
import java.util.ResourceBundle;

import composant.ListRoom;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class PopupOverview implements Initializable {
	
	@FXML
	private Label roomLabel;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		roomLabel.setText(ListRoom.roomSelected+"");
	}

}
