package fr.delmaire.universite.etudiant.repository;

import java.util.List;

import fr.delmaire.universite.etudiant.domain.Etudiant;

public interface IEtudiantRepository {

	List<Etudiant> findAll();

	Etudiant getOne(Integer id);

	Etudiant save(Etudiant etudiant);
	
	public void update(Etudiant etudiant, Integer id);
	
	void deleteById(Integer id);

}
