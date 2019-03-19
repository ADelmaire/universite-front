package fr.delmaire.universite.etudiant.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.delmaire.universite.etudiant.domain.Etudiant;
import fr.delmaire.universite.etudiant.repository.IEtudiantRepository;
import fr.delmaire.universite.etudiant.service.IEtudiantService;

@Service
public class EtudiantServiceImpl implements IEtudiantService{

	Logger log = LoggerFactory.getLogger(EtudiantServiceImpl.class);

	@Autowired
	IEtudiantRepository er;

	@Override
	public List<Etudiant> findAll() {
		List<Etudiant> liste = er.findAll();

		for (int i = 0; i < liste.size(); i++) {
			Etudiant e = liste.get(i);

			log.info("photo de l'étudiant :{}", e.getPhoto());

			if(e.getPhoto() == null || e.getPhoto().equals("")) {
				liste.get(i).setPhoto("https://image.flaticon.com/icons/png/512/199/199338.png");
			} 
		}
		return liste;
	}

	@Override
	public Etudiant findOne(Integer id) {
		Etudiant e = er.getOne(id);

		if (e.getPhoto() == null || e.getPhoto().equals("")) {
			e.setPhoto("https://image.flaticon.com/icons/png/512/199/199338.png");
		}
		return e;
	}

	@Override
	public Etudiant sauvegardeAjout(Etudiant etudiant) {
		Etudiant et = er.save(etudiant);
		return et;
	}

	@Override
	public Etudiant sauvegarderModif(Etudiant etudiant) {
		Integer id = etudiant.getId();
		er.update(etudiant, id);
		Etudiant e = er.getOne(id);
		return e;
	}

	@Override
	public void supprimer(Integer id) {
		er.deleteById(id);
	}
}
