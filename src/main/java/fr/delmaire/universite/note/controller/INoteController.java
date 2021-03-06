package fr.delmaire.universite.note.controller;

import org.springframework.ui.Model;

import fr.delmaire.universite.note.domain.Note;

public interface INoteController {
	public String findAll(Model model);
	
	public String addNote(Model model);
	
	public String validerAdd(Model model, Note note);
	
	public String modifierNoteFormulaire
		(Model model, Integer idMatiere, Integer idEtudiant);
	
}
