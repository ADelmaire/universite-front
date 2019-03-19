package fr.delmaire.universite.note.service;

import java.util.List;

import fr.delmaire.universite.note.domain.Note;

public interface INoteService {
	public List<Note> findAll();
	
	public Note save(Note note);
	
	public Note findOne(Integer idEtudiant, Integer idMatiere);
}
