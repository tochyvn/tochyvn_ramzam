package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;

public class RootController implements Initializable {
	
	@FXML
	private Button button1;
	
	@FXML
	private Button button2;
	
	@FXML
	private BorderPane root;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
	
	@FXML
	public void click1() {
		Parent frame1 = (AnchorPane) this.loadFXML("/application/Frame1.fxml");
		root.setCenter(frame1);
		DoubleProperty opacity = frame1.opacityProperty();
		this.doAnimationOpacity(opacity);
	}
	
	@FXML
	public void click2() {
		Parent frame2 = (AnchorPane) this.loadFXML("/application/Frame2.fxml");
		root.setCenter(frame2);
		
		DoubleProperty opacity = frame2.opacityProperty();
		this.doAnimationOpacity(opacity);
        
	}
	
	private Parent loadFXML(String path) {
		Parent root = null;
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource(path));
		try {
			root =  loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return root;
	}
	
	/**
	 * Créer des animation sur l'opacité d'un composante
	 * @param opacity
	 */
	private void doAnimationOpacity(DoubleProperty opacity) {
		Timeline timeline = new Timeline();
        timeline.getKeyFrames().addAll(
            new KeyFrame(Duration.ZERO, new KeyValue(opacity, 0)),
            new KeyFrame(new Duration(5000), new KeyValue(opacity, 1))
        );
        
        timeline.play();
	}

}
