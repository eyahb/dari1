package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="annoncesfavorites")
public class AnnoncesFavorites implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id; // Identifiant formation (Clé primaire)

	@Column(name = "description")
	private String description;

	@Column(name = "prix")
	private float prix;

	@Column(name = "image")
	private String image;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public AnnoncesFavorites() {

	}

	public AnnoncesFavorites(Long id, String description, float prix, String image) {
		super();
		this.id = id;
		this.description = description;
		this.prix = prix;
		this.image = image;
	}

}
