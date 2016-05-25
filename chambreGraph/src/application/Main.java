package application;
	
import composant.BoxRoom;
import composant.ChambreComposante;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Chambre;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			
			/*
			FlowPane flowPane = new FlowPane();
			flowPane.setHgap(9.0);
			flowPane.setVgap(9.0);
			*/
			
			Chambre chambre = new Chambre("100 m2", "0755032386", 2, 2, 0, 0);
			chambre.setIdChambre(1);
			BoxRoom boxRoom = new BoxRoom(chambre, false);
			//boxRoom.addEvent();
			root.setCenter(boxRoom);
			
			/*
			Chambre chambre1 = new Chambre("300 m2", "0755032386", 2, 2, 0, 0);
			Chambre chambre2 = new Chambre("150 m2", "0755032386", 2, 2, 0, 0);
			Chambre chambre3 = new Chambre("20 m2", "0755032386", 2, 2, 0, 0);
			Chambre chambre4 = new Chambre("100 m2", "0755032386", 2, 2, 0, 0);
			Chambre chambre5 = new Chambre("100 m2", "0755032386", 2, 2, 0, 0);
			Chambre chambre6 = new Chambre("100 m2", "0755032386", 2, 2, 0, 0);
			Chambre chambre7 = new Chambre("100 m2", "0755032386", 2, 2, 0, 0);
			
			chambre.setIdChambre(1);
			chambre1.setIdChambre(2);
			chambre2.setIdChambre(3);
			chambre3.setIdChambre(4);
			chambre4.setIdChambre(5);
			chambre5.setIdChambre(6);
			chambre6.setIdChambre(7);
			chambre7.setIdChambre(8);
			
			
			ChambreComposante chambreGraph = new ChambreComposante(chambre);
			//chambreGraph.addEvent();
			flowPane.getChildren().addAll(chambreGraph.vbox, new ChambreComposante(chambre1).vbox,
					new ChambreComposante(chambre2).vbox, 
					new ChambreComposante(chambre3).vbox, 
					new ChambreComposante(chambre4).vbox,
					new ChambreComposante(chambre5).vbox,
					new ChambreComposante(chambre6).vbox,
					new ChambreComposante(chambre7).vbox);
			root.setCenter(flowPane);
			*/
			
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
