package composant;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
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
		//this(5.0);
		this.chambre = chambre;
		String url = "/ressources/img/libre.png";
		if (image) {
			url = "/ressources/img/occupe.png";
		}
		Image img = new Image(url);
		ImageView imageView = new ImageView(img);
		this.getChildren().add(0, imageView);
		Pane panel = new Pane();
		panel.getChildren().add(new Label("Ici les infos de la chambre"));
		this.getChildren().add(1, panel);
		this.addEvent();
	
		
		System.out.println(this.getPrefWidth()+" Haut : "+this.getPrefHeight());
		System.out.println(panel.getPrefWidth()+" Haut : "+panel.getPrefHeight());
		
	}
	
	public void addEvent() {
		this.setOnMouseClicked((event) -> {
			System.out.println(event.getSource());
			/*
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
			*/
		});
		
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
