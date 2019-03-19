package fr.delmaire.universite.matiere.service;

import java.util.List;

import fr.delmaire.universite.matiere.domain.Matiere;

public interface IMatiereService {
	public List<Matiere> findAll();
	
	public Matiere findOne(Integer id);
	
	public Matiere save(Matiere matiere);
	
	public Matiere update(Matiere matiere);
	
	public void supprimer (Integer id);
}
