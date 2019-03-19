package fr.delmaire.universite.etudiant.service;

import java.util.List;

import fr.delmaire.universite.etudiant.domain.Etudiant;

public interface IEtudiantService {

	public List<Etudiant> findAll();
	
	public Etudiant findOne(Integer id);
	
	public Etudiant sauvegardeAjout (Etudiant etudiant);
	
	public Etudiant sauvegarderModif (Etudiant etudiant);
	
	public void supprimer (Integer id);
	
}
