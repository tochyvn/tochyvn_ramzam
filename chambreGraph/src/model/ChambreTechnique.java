package model;

import javafx.scene.image.ImageView;

public class ChambreTechnique extends Chambre {
	
	private ImageView imageUpdate;
	private ImageView imageDelete;
	
	public ChambreTechnique() {
		super();
	}

	public ChambreTechnique(String surface, String telephone, Integer etage, Integer nbrePlace, Integer douche,
			Integer baignoire, ImageView imageUpdate, ImageView imageDelete) {
		super(surface, telephone, etage, nbrePlace, douche, baignoire);
		this.imageUpdate = imageUpdate;
		this.imageDelete = imageDelete;
	}
	
	
	
}
