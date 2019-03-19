package fr.delmaire.universite.enseignant.service;

import java.util.List;

import fr.delmaire.universite.enseignant.domain.Enseignant;

public interface IEnseignantService {

	public List<Enseignant> findAll(); 
	
	public Enseignant findOne(Integer id);
	
	public void supprimer (Integer id);
	
	public Enseignant sauvegarder (Enseignant enseignant);
	
	public Enseignant sauvegarderModif (Enseignant enseignant);
}
