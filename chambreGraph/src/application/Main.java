package application;
	
import java.util.ArrayList;

import composant.ListRoom;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Chambre;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			ListRoom listeChambres = new ListRoom(this.getChambres());
			root.setCenter(listeChambres.getParentScrollPane());
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
	
	private ArrayList<Chambre> getChambres() {
		Chambre chambre1 = new Chambre("300 m2", "0755032386", 2, 2, 0, 0);
		Chambre chambre2 = new Chambre("150 m2", "0755032386", 2, 2, 0, 0);
		Chambre chambre3 = new Chambre("20 m2", "0755032386", 2, 2, 0, 0);
		Chambre chambre4 = new Chambre("100 m2", "0755032386", 2, 2, 0, 0);
		Chambre chambre5 = new Chambre("100 m2", "0755032386", 2, 2, 0, 0);
		Chambre chambre6 = new Chambre("100 m2", "0755032386", 2, 2, 0, 0);
		Chambre chambre7 = new Chambre("100 m2", "0755032386", 2, 2, 0, 0);
		Chambre chambre8 = new Chambre("300 m2", "0755032386", 2, 2, 0, 0);
		Chambre chambre9 = new Chambre("150 m2", "0755032386", 2, 2, 0, 0);
		Chambre chambre10 = new Chambre("20 m2", "0755032386", 2, 2, 0, 0);
		Chambre chambre11 = new Chambre("100 m2", "0755032386", 2, 2, 0, 0);
		Chambre chambre12 = new Chambre("100 m2", "0755032386", 2, 2, 0, 0);
		Chambre chambre13 = new Chambre("100 m2", "0755032386", 2, 2, 0, 0);
		Chambre chambre14 = new Chambre("100 m2", "0755032386", 2, 2, 0, 0);
		Chambre chambre = new Chambre("100 m2", "0755032386", 2, 2, 0, 0);
		chambre.setIdChambre(1);
		chambre1.setIdChambre(2);
		chambre2.setIdChambre(3);
		chambre3.setIdChambre(4);
		chambre4.setIdChambre(5);
		chambre5.setIdChambre(6);
		chambre6.setIdChambre(7);
		chambre7.setIdChambre(8);
		chambre8.setIdChambre(2);
		chambre9.setIdChambre(3);
		chambre10.setIdChambre(4);
		chambre11.setIdChambre(5);
		chambre12.setIdChambre(6);
		chambre13.setIdChambre(7);
		chambre14.setIdChambre(8);
		
		ArrayList<Chambre> chambres = new ArrayList<Chambre>();
		chambres.add(chambre);
		chambres.add(chambre1);
		chambres.add(chambre2);
		chambres.add(chambre3);
		chambres.add(chambre4);
		chambres.add(chambre5);
		chambres.add(chambre6);
		chambres.add(chambre8);
		chambres.add(chambre9);
		chambres.add(chambre10);
		chambres.add(chambre11);
		chambres.add(chambre12);
		chambres.add(chambre13);
		chambres.add(chambre14);
		chambres.add(chambre7);
		
		return chambres;
		
	}
}
