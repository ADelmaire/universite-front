package fr.delmaire.universite.matiere.repository;

import java.util.List;

import fr.delmaire.universite.matiere.domain.Matiere;

public interface IMatiereRepository {

	List<Matiere> findAll();

	Matiere getOne(Integer id);

	Matiere save(Matiere matiere);

	public void update(Matiere matiere, Integer id);
	
	void deleteById(Integer id);
}
