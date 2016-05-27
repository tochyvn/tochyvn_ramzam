package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			primaryStage.setTitle("Imported Fruits");
			primaryStage.setWidth(900);
			primaryStage.setHeight(500);
			
			FXMLLoader loader =  new FXMLLoader(getClass().getResource("PieChartOverview.fxml"));
			BorderPane root = (BorderPane) loader.load();
			Scene scene = new Scene(root, 100 , 100);
			
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
