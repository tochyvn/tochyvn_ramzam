package composant;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Popup extends Stage {
	
	/**
	 * La scene � charger dans la popup
	 */
	private Scene sceneLoaded;
	
	public Popup(Scene scene) {
		super();
		this.setScene(scene);
		this.setWidth(400);
		this.setHeight(400);
		//Pour faire rester la popup au premier plan
		this.initModality(Modality.APPLICATION_MODAL);
	}

	public Scene getSceneLoaded() {
		return sceneLoaded;
	}

	public void setSceneLoaded(Scene sceneLoaded) {
		this.sceneLoaded = sceneLoaded;
	}
	
	/**
	 * Charger une ressource physique sous forme de scene
	 * @param path le chemin du fichier .fxml correspondant � la scene
	 * @param typeLayout un entier reprentant le type de layout de la scene
	 * 0 pour le BorderPane
	 * 1 Pour le AnchorPane
	 * 2 Pour du GridPane
	 * @return retourne la scene qui a �t� charg�e
	 */
	public static Scene loadScene(String path, int typeLayout) {
		Scene scene = null;
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource(path));
		Parent rootLayout;
		try {
			rootLayout = null;
			switch (typeLayout) {
			case 0:
				rootLayout = (BorderPane)loader.load();
				break;
				
			case 1:
				rootLayout = (AnchorPane)loader.load();
				break;
				
			case 2:
				rootLayout = (GridPane)loader.load();
				break;
			}
			scene = new Scene(rootLayout);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return scene;
	}
	
	

}

