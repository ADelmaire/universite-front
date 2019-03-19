package fr.delmaire.universite.etudiant.repository.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import fr.delmaire.universite.etudiant.domain.Etudiant;
import fr.delmaire.universite.etudiant.repository.IEtudiantRepository;

@Repository
public class EtudiantRepositoryImpl implements IEtudiantRepository{

	RestTemplate rt = new RestTemplate();

	@Override
	public List<Etudiant> findAll() {
		List<Etudiant> liste = rt.exchange(
				"http://localhost:8080/etudiants", 
				HttpMethod.GET,
				null, 
				new ParameterizedTypeReference <List<Etudiant>> (){})
				.getBody();
		return liste;
	}

	@Override
	public Etudiant getOne(Integer id) {
		Etudiant e = rt.getForObject(
				"http://localhost:8080/etudiants/"+ id, 
				Etudiant.class
				);
		return e;
	}

	@Override
	public Etudiant save(Etudiant etudiant) {
		Etudiant e = rt.postForObject(
				"http://localhost:8080/etudiants", 
				etudiant, 
				Etudiant.class);
		return e;
	}

	@Override
	public void update(Etudiant etudiant, Integer id) {
		rt.put(
				"http://localhost:8080/etudiants/" + id, 
				etudiant, 
				Etudiant.class);
	}

	@Override
	public void deleteById(Integer id) {
		rt.delete("http://localhost:8080/etudiants/"+ id);

	}

}
