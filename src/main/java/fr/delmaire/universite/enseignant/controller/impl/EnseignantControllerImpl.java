package fr.delmaire.universite.enseignant.controller.impl;

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

import fr.delmaire.universite.enseignant.controller.IEnseignantController;
import fr.delmaire.universite.enseignant.domain.Enseignant;
import fr.delmaire.universite.enseignant.service.impl.EnseignantServiceImpl;

@Controller
public class EnseignantControllerImpl implements IEnseignantController{

	Logger log = LoggerFactory.getLogger(EnseignantControllerImpl.class);
	@Autowired
	EnseignantServiceImpl enseignantService;

	@Override
	@GetMapping("/enseignants")
	public String findAll(Model model) {
		List<Enseignant> list = enseignantService.findAll();
		log.info("Nombre enseignants:{}", list.size());
		model.addAttribute("enseignants", list);
		return "enseignant/enseignants";
	}

	@Override
	@GetMapping("/enseignant-infos")
	public String enseignantInfos(Model model, @RequestParam("id") Integer id) {
		Enseignant enseignant = enseignantService.findOne(id);
		model.addAttribute("enseignant", enseignant);
		return "enseignant/enseignant-infos";
	}

	@Override
	@GetMapping("/supprimer")
	public String supprimerEnseignant(Model model, @RequestParam Integer id) {
		enseignantService.supprimer(id);
		return "redirect:/enseignants";
	}

	@Override
	@GetMapping("/ajouter-enseignant")
	public String ajouterEnseignant(Model model) {
		Enseignant e= new Enseignant();
		model.addAttribute("e", e);
		return "enseignant/ajouter-enseignant-formulaire";
	}

	@Override
	@PostMapping("/valider-enseignant")
	public String validerEnseignant(Model model, @ModelAttribute Enseignant e) {
		log.info("Nom enseignant:{}", e.getNom());
		// {} evite de mettre des +
		log.info("Prenom enseignant:{}", e.getPrenom());
		log.info("Numero enseignant:{}", e.getNumero());
		log.info("Date de naissance enseignant:{}", e.getDateNaissance());
		log.info("Grade enseignant:{}", e.getGrade());
		log.info("Date d'embauche enseignant:{}", e.getDateEmbauche());
		log.info("Photo enseignant:{}", e.getPhoto());

		// appel du service pour sauvegarder
		Enseignant en = enseignantService.sauvegarder(e);
		if(en == null) {
			return"redirect:/ajouter-enseignant-formulaire";
		}else {
			return "redirect:/enseignants";
		}
	}

	@Override
	@GetMapping("/modifier-enseignant")
	public String modifierEnseignant(Model model, @RequestParam("id") Integer id) {
		Enseignant ens = enseignantService.findOne(id);
		model.addAttribute("ens", ens);
		return "enseignant/modifier-enseignant-formulaire";
	}

	@Override
	@PostMapping("/valider-modification-enseignant")
	public String valilderModificationEnseignant(Model model, @ModelAttribute Enseignant ens) {
		enseignantService.sauvegarderModif(ens);
		if(ens == null) {
			return "redirect:/modifier-enseignant";
		}else {
		return "redirect:/enseignants";
		}
	}

}
