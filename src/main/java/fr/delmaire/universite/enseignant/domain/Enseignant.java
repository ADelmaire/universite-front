package fr.delmaire.universite.enseignant.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class Enseignant {


	private Integer id;
	private Integer numero;
	private String nom;
	private String prenom;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateNaissance;
	private Character sexe;
	private String grade;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date DateEmbauche;
	private String photo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Character getSexe() {
		return sexe;
	}

	public void setSexe(Character sexe) {
		this.sexe = sexe;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Date getDateEmbauche() {
		return DateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		DateEmbauche = dateEmbauche;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
