package fr.delmaire.universite.enseignant.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.delmaire.universite.enseignant.domain.Enseignant;
import fr.delmaire.universite.enseignant.repository.IEnseignantRepository;
import fr.delmaire.universite.enseignant.service.IEnseignantService;

@Service
public class EnseignantServiceImpl implements IEnseignantService{

	Logger log = LoggerFactory.getLogger(EnseignantServiceImpl.class);
	@Autowired
	IEnseignantRepository enseignantRepository;

	@Override
	public List<Enseignant> findAll() {
		List<Enseignant> list = enseignantRepository.findAll();
		
		for(int i=0; i < list.size(); i++) {
			Enseignant e = list.get(i);
		
			log.info("Image de l'enseignant:{}", e.getPhoto());
			if(e.getPhoto() == null || e.getPhoto().equals("")) {
				list.get(i).setPhoto(
						"http://bibliotheque.sciencespo-lyon.fr/wp-content/uploads/2018/10/des-enseignants-de-lecture_318-28655.jpg");
			}
		}
		return list;
	}

	@Override
	public Enseignant findOne(Integer id) {
		Enseignant ens = enseignantRepository.getOne(id);
		if (ens.getPhoto() == null || ens.getPhoto().equals("")) {
			ens.setPhoto(
					"http://bibliotheque.sciencespo-lyon.fr/wp-content/uploads/2018/10/des-enseignants-de-lecture_318-28655.jpg");
		}
		return ens;
	}

	@Override
	public void supprimer(Integer id) {
		enseignantRepository.deleteById(id);
	}

	@Override
	public Enseignant sauvegarder (Enseignant enseignant) {
		Enseignant ens = enseignantRepository.save(enseignant);
		return ens;
	}

	@Override
	public Enseignant sauvegarderModif(Enseignant enseignant) {
		Integer id = enseignant.getId();
		
		enseignantRepository.update(enseignant, id);
		Enseignant e = enseignantRepository.getOne(id);
		return e;
	}

	@Override
	public List<Enseignant> getEnseignants(String s) {
		List<Enseignant> liste = enseignantRepository.getEnseignants(s);
		return liste;
	}

}
