package model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee {
	
	private StringProperty nom;
	private StringProperty poste;
	private StringProperty adresse;
	private DoubleProperty salaire;
	
	public Employee(String nom, String poste, String adresse, Double salaire) {
		super();
		this.nom = new SimpleStringProperty(nom);
		this.poste = new SimpleStringProperty(poste);
		this.adresse = new SimpleStringProperty(adresse);
		this.salaire = new SimpleDoubleProperty(salaire);
	}

	public final StringProperty nomProperty() {
		return this.nom;
	}
	

	public final java.lang.String getNom() {
		return this.nomProperty().get();
	}
	

	public final void setNom(final java.lang.String nom) {
		this.nomProperty().set(nom);
	}
	

	public final StringProperty posteProperty() {
		return this.poste;
	}
	

	public final java.lang.String getPoste() {
		return this.posteProperty().get();
	}
	

	public final void setPoste(final java.lang.String poste) {
		this.posteProperty().set(poste);
	}
	

	public final StringProperty adresseProperty() {
		return this.adresse;
	}
	

	public final java.lang.String getAdresse() {
		return this.adresseProperty().get();
	}
	

	public final void setAdresse(final java.lang.String adresse) {
		this.adresseProperty().set(adresse);
	}
	

	public final DoubleProperty salaireProperty() {
		return this.salaire;
	}
	

	public final double getSalaire() {
		return this.salaireProperty().get();
	}
	

	public final void setSalaire(final double salaire) {
		this.salaireProperty().set(salaire);
	}
	 
	
	
}
