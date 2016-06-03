package application;
	
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Root.fxml"));
			BorderPane root =  (BorderPane) loader.load();
			
			//Créer l'objet property qui va manipuler la translationProperty horizontale du panel de gauche dans la BorderPane
			DoubleProperty translateX = root.getLeft().translateXProperty();
			Timeline timeline = new Timeline();
	        timeline.getKeyFrames().addAll(
	            new KeyFrame(Duration.ZERO, new KeyValue(translateX, 45)),
	            new KeyFrame(new Duration(1000), new KeyValue(translateX, -200))
	        );
	        //Faire l'aller et retour automatique
	        timeline.setAutoReverse(true);
	        //Durée des cycles indéterminé
	        timeline.setCycleCount(Timeline.INDEFINITE);
	        timeline.play();

			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
