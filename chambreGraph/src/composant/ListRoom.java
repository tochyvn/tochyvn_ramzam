package composant;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import model.Chambre;

public class ListRoom extends FlowPane {
	
	private ObservableList<BoxRoom> rooms;
	private ScrollPane parentScrollPane;

	public ScrollPane getParentScrollPane() {
		return parentScrollPane;
	}


	public ListRoom() {
		rooms = FXCollections.observableArrayList();
	}

	public ListRoom(Orientation orientation) {
		super(orientation);
	}

	public ListRoom(double hgap, double vgap) {
		super(hgap, vgap);
	}


	public ListRoom(ArrayList<Chambre> chambres) {
		this(Orientation.HORIZONTAL);
		this.rooms = FXCollections.observableArrayList();
		this.putRoom(chambres);
		//Ajouter une barre de defilement
		parentScrollPane = new ScrollPane(this);
		//Pour faire son enfant matcher la taille de son parent
		parentScrollPane.setFitToHeight(true);
		parentScrollPane.setFitToWidth(true);
	}
	
	/**
	 * Permet d'ajouter chaque chambre dans le composant liste de chambre
	 */
	public void setItems(ObservableList<BoxRoom> rooms) {
		for (BoxRoom boxRoom : rooms) {
			this.getChildren().add(boxRoom);
		}
	}
	
	public boolean addItems(BoxRoom boxRoom) {
		return this.rooms.add(boxRoom);
	}
	
	private void putRoom(ArrayList<Chambre> chambres) {
		for (Chambre chambre : chambres) {
			BoxRoom boxRoom = new BoxRoom(chambre, false);
			this.getChildren().add(boxRoom);
			//this.rooms.add(boxRoom);
		}
	}

}