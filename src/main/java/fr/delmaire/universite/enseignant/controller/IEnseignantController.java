package fr.delmaire.universite.enseignant.controller;

import org.springframework.ui.Model;

import fr.delmaire.universite.enseignant.domain.Enseignant;

public interface IEnseignantController {

	public String findAll (Model model);
	
	public String enseignantInfos (Model model, Integer id);
	
	public String supprimerEnseignant (Model model, Integer id);
	
	public String ajouterEnseignant (Model model);
	
	public String validerEnseignant (Model model, Enseignant enseignant);
	
	public String modifierEnseignant (Model model, Integer id);
	
	public String valilderModificationEnseignant (Model model, Enseignant e);
	
	public String chercherLesEnseignants (Model model, String nom);
}
