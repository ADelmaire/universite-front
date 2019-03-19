package fr.delmaire.universite.matiere.domain;

import java.util.List;

import fr.delmaire.universite.enseignant.domain.Enseignant;
import fr.delmaire.universite.note.domain.Note;

public class Matiere {

	private Integer id ;

	private Integer numero;

	private String nom;

	private Integer coef;

	private Enseignant enseignant;
	
	private List<Note> notes;

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

	public Integer getCoef() {
		return coef;
	}

	public void setCoef(Integer coef) {
		this.coef = coef;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

}
