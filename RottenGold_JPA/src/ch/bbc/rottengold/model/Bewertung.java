package ch.bbc.rottengold.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Bewertung.findAll", query = "SELECT b FROM Bewertung b")
public class Bewertung implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int bewertung_id;
	
	private int id_user;
	
	private int id_website;

	private int bewertung;

	public Bewertung(){
		
	}
	
	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public int getId_website() {
		return id_website;
	}

	public void setId_website(int id_website) {
		this.id_website = id_website;
	}

	public int getBewertung() {
		return bewertung;
	}

	public void setBewertung(int bewertung) {
		this.bewertung = bewertung;
	}
}