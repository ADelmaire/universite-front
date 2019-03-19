package fr.delmaire.universite.enseignant.repository;

import java.util.List;

import fr.delmaire.universite.enseignant.domain.Enseignant;

public interface IEnseignantRepository {

	List<Enseignant> findAll();

	Enseignant getOne(Integer id);

	void deleteById(Integer id);

	Enseignant save(Enseignant enseignant);
	
	public void update(Enseignant enseignant, Integer id);

}
