package composant;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.layout.FlowPane;

public class ListRoom extends FlowPane {
	
	private ObservableList<BoxRoom> rooms;

	public ListRoom() {
		
	}

	public ListRoom(Orientation orientation) {
		super(orientation);
		// TODO Auto-generated constructor stub
	}

	public ListRoom(double hgap, double vgap) {
		super(hgap, vgap);
		// TODO Auto-generated constructor stub
	}


	public ListRoom(ObservableList<BoxRoom> rooms) {
		this(Orientation.HORIZONTAL);
		this.rooms = rooms;
	}
	
	/**
	 * Permet d'ajouter chaque chambre dans le composant liste de chambre
	 */
	public void setItems(ObservableList<BoxRoom> rooms) {
		for (BoxRoom boxRoom : rooms) {
			this.getChildren().add(boxRoom);
		}
	}

}
