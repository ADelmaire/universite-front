package fr.delmaire.universite.etudiant.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.delmaire.universite.etudiant.controller.IEtudiantController;
import fr.delmaire.universite.etudiant.domain.Etudiant;
import fr.delmaire.universite.etudiant.service.impl.EtudiantServiceImpl;

@Controller
public class EtudiantControllerImpl implements IEtudiantController{

	Logger log = LoggerFactory.getLogger(EtudiantControllerImpl.class);
	
	@Autowired
	EtudiantServiceImpl es;
	
	@Override
	@GetMapping ("/etudiants")
	public String findAll(Model model) {
		List<Etudiant> liste = es.findAll();
		model.addAttribute("etudiants", liste);
		return "etudiant/etudiants-accueil";
	}

	@Override
	@GetMapping("/etudiant-infos")
	public String findOneEtudiant(Model model, @RequestParam("id") Integer id) {
		Etudiant e = es.findOne(id);
		model.addAttribute("etudiant", e);
		return "etudiant/infos-etudiant";
	}

	@Override
	@GetMapping("/ajouter-etudiant")
	public String ajouterEtudiant(Model model) {
		Etudiant e = new Etudiant();
		model.addAttribute("e", e);
		// "e" qu'on retrouve dans le template ajouter-etudiant-formulaire
		return "etudiant/formulaire-ajout-etudiant";
	}

	@Override
	@PostMapping("/valider-etudiant")
	public String validerAjoutEtudiant(Model model, @ModelAttribute Etudiant e) {
		log.info("Nom etudiant:{}", e.getNom());
		log.info("Prenom etudiant:{}", e.getPrenom());
		log.info("Numero etudiant:{}", e.getNumero());
		log.info("Date de naissance etudiant:{}", e.getDateNaissance());
		log.info("Photo etudiant:{}", e.getPhoto());

		Etudiant et = es.sauvegardeAjout(e);
		if(et == null) {
			return"redirect:/formulaire-ajout-etudiant";
		}else {
		return "redirect:/etudiants";
		}
	}

	@Override
	@GetMapping("/modifier-etudiant")
	public String modifierEtudiant(Model model, @RequestParam("id") Integer id) {
		Etudiant e = es.findOne(id);
		model.addAttribute("e", e);
		return "etudiant/formulaire-modif-etudiant";
	}

	@Override
	@PostMapping("/valider-etudiant")
	public String valilderModificationEtudiant(Model model, @ModelAttribute Etudiant e) {
		es.sauvegarderModif(e);
		return "redirect:/etudiants";
	}

}
