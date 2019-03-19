package fr.delmaire.universite.note.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.delmaire.universite.note.domain.Note;
import fr.delmaire.universite.note.domain.NotePK;
import fr.delmaire.universite.note.repository.INoteRepository;

@Repository
public class NoteRepositoryImpl implements INoteRepository{

	@Override
	public List<Note> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Note save(Note note) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Note getOne(NotePK npk) {
		// TODO Auto-generated method stub
		return null;
	}

}
