package fr.delmaire.universite.note.repository;

import java.util.List;

import fr.delmaire.universite.note.domain.Note;
import fr.delmaire.universite.note.domain.NotePK;

public interface INoteRepository {

	List<Note> findAll();

	Note save(Note note);

	Note getOne(NotePK npk);

}
