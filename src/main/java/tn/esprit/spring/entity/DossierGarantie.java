package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DossierGarantie")
public class DossierGarantie implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire
	private int id;
	@Column(name = "Fiche1")
	private String Fiche1;
	@Column(name = "Fiche2")
	private String Fiche2;
	@Column(name = "Fiche3")
	private String Fiche3;
	@Column(name = "Fiche4")
	private String Fiche4;
	@Column(name = "Fiche5")
	private String Fiche5;

	public DossierGarantie() {

	}

	public DossierGarantie(int id, String fiche1, String fiche2, String fiche3, String fiche4, String fiche5) {
		super();
		this.id = id;
		Fiche1 = fiche1;
		Fiche2 = fiche2;
		Fiche3 = fiche3;
		Fiche4 = fiche4;
		Fiche5 = fiche5;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFiche1() {
		return Fiche1;
	}

	public void setFiche1(String fiche1) {
		Fiche1 = fiche1;
	}

	public String getFiche2() {
		return Fiche2;
	}

	public void setFiche2(String fiche2) {
		Fiche2 = fiche2;
	}

	public String getFiche3() {
		return Fiche3;
	}

	public void setFiche3(String fiche3) {
		Fiche3 = fiche3;
	}

	public String getFiche4() {
		return Fiche4;
	}

	public void setFiche4(String fiche4) {
		Fiche4 = fiche4;
	}

	public String getFiche5() {
		return Fiche5;
	}

	public void setFiche5(String fiche5) {
		Fiche5 = fiche5;
	}

	@Override
	public String toString() {
		return "DossierGarantie [id=" + id + ", Fiche1=" + Fiche1 + ", Fiche2=" + Fiche2 + ", Fiche3=" + Fiche3
				+ ", Fiche4=" + Fiche4 + ", Fiche5=" + Fiche5 + "]";
	}

}
