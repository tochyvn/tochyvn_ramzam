package composant;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.WindowEvent;
import model.Chambre;

public class BoxRoom extends VBox {
	
	private Chambre chambre;

	public BoxRoom() {
		// TODO Auto-generated constructor stub
	}

	public BoxRoom(double spacing) {
		super(spacing);
	}
	
	public BoxRoom(Chambre chambre, boolean image) {
		this(5.0);
		this.chambre = chambre;
		String url = "/ressources/img/libre.png";
		if (image) {
			url = "/ressources/img/occupe.png";
		}
		Image img = new Image(url);
		ImageView imageView = new ImageView(img);
		this.getChildren().add(0, imageView);
		Pane panel = new Pane();
		panel.getChildren().add(new Label(chambre.toString()));
		this.getChildren().add(1, panel);
		//Ajouter l'evenement qui se produira au clique
		this.addEvent();
	
		
		//System.out.println(this.getPrefWidth()+" Haut : "+this.getPrefHeight());
		//System.out.println(panel.getPrefWidth()+" Haut : "+panel.getPrefHeight());
		
	}
	
	public void addEvent() {
		this.setOnMouseClicked((event) -> {
			
			//On recupère la BoxRoom sur laquelle l'on a cliqué
			BoxRoom room = (BoxRoom) event.getSource();
			ListRoom.roomSelected = room.chambre;
			System.out.println(room);
			
			String path = "/application/PopupOverview.fxml";
			Scene scene = Popup.loadScene(path, 0);
			//System.out.println(event.getSource());
			
			Popup popup = new Popup(scene);
			popup.setTitle("My modal window");
			popup.initOwner((((Node) event.getSource()).getScene()).getWindow());
			
			//Definir une action à la fermeture de la popup
			popup.setOnCloseRequest(new EventHandler<WindowEvent>() {

				@Override
				public void handle(WindowEvent event) {
					System.out.println("Mettre la variable statique de chambre Ã  NULL");
					ListRoom.roomSelected = null;
				}
			});
			popup.showAndWait();
			
		});
		
		//Changer le curseur de la souris au survol d'une chambre BoxRoom
		this.setOnMouseEntered(new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				setCursor(Cursor.HAND);
			}
		});
		
	}
	
	@Override
	public String toString() {
		return this.chambre+"";
	}

}
