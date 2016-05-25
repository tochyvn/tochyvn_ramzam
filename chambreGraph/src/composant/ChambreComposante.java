package composant;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import model.Chambre;

public class ChambreComposante extends Button {
	
	private Chambre chambre;
	public VBox vbox;

	public ChambreComposante() {
		
	}

	public ChambreComposante(String text) {
		super(text);
	}

	public ChambreComposante(String text, Node graphic) {
		super(text, graphic);
	}
	
	public ChambreComposante(Chambre chambre) {
		this("Id : "+chambre.getIdChambre()+" surface : "+chambre.getSurface());
		this.setChambre(chambre);
		this.addEvent();
		vbox = new VBox();
		vbox.getChildren().addAll(new Label("Ici image"), this);
	}

	public Chambre getChambre() {
		return chambre;
	}

	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}
	
	public void addEvent() {
		this.setOnAction((event) -> {
			// Button was clicked, do something...
			System.out.println(event.getSource());
			Stage secondStage = new Stage();
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			secondStage.setScene(scene);
			secondStage.setTitle("My modal window");
			secondStage.initModality(Modality.APPLICATION_MODAL);
			secondStage.initOwner((((Node) event.getSource()).getScene()).getWindow());
			secondStage.setOnCloseRequest(new EventHandler<WindowEvent>() {

				@Override
				public void handle(WindowEvent event) {
					System.out.println("Mettre la variable statique de chambre à NULL");
				}
			});
			secondStage.showAndWait();

		});
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.chambre+"";
	}
	
	

}
