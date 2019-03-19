package fr.delmaire.universite.etudiant.controller;

import org.springframework.ui.Model;

import fr.delmaire.universite.etudiant.domain.Etudiant;

public interface IEtudiantController {

	public String findAll (Model model);

	public String findOneEtudiant (Model model, Integer id);

	public String ajouterEtudiant (Model model);

	public String validerAjoutEtudiant (Model model, Etudiant e);

	public String modifierEtudiant (Model model, Integer id);

	public String valilderModificationEtudiant (Model model, Etudiant e);
}
