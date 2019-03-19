package fr.delmaire.universite.note.domain;

import fr.delmaire.universite.etudiant.domain.Etudiant;
import fr.delmaire.universite.matiere.domain.Matiere;

public class Note {

	private NotePK notePK;
	
	private Double note;

	private Etudiant etudiant;
	
	private Matiere matiere;

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}


	public Etudiant getEtudiant() {
		return etudiant;
	}


	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}


	public Matiere getMatiere() {
		return matiere;
	}


	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}


	public NotePK getNotePK() {
		return notePK;
	}


	public void setNotePK(NotePK notePK) {
		this.notePK = notePK;
	}
}
