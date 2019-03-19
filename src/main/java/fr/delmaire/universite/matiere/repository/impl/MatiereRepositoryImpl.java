package fr.delmaire.universite.matiere.repository.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import fr.delmaire.universite.matiere.domain.Matiere;
import fr.delmaire.universite.matiere.repository.IMatiereRepository;

@Repository
public class MatiereRepositoryImpl implements IMatiereRepository{

	RestTemplate rt = new RestTemplate();
	
	@Override
	public List<Matiere> findAll() {
		List<Matiere> liste = rt.exchange(
				"http://localhost:8080/matieres", 
				HttpMethod.GET,
				null, 
				new ParameterizedTypeReference <List<Matiere>> (){})
				.getBody();
		return liste;
	}

	@Override
	public Matiere getOne(Integer id) {
		Matiere m = rt.getForObject(
				"http://localhost:8080/matieres/"+ id, 
				Matiere.class
				);
		return m;
	}

	@Override
	public Matiere save(Matiere matiere) {
		Matiere m = rt.postForObject(
				"http://localhost:8080/matieres", 
				matiere, 
				Matiere.class);
		return m;
	}

	@Override
	public void update(Matiere matiere, Integer id) {
		rt.put(
				"http://localhost:8080/matieres/" + id, 
				matiere, 
				Matiere.class);
	}

	@Override
	public void deleteById(Integer id) {
		rt.delete("http://localhost:8080/matieres/"+ id);
		
	}

}
