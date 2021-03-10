package com.ittraining.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.ittraining.dto.RecupNewFormation;
import com.ittraining.entities.Formation;
import com.ittraining.repositories.FormationRepository;

@Service
public class FormationService {

	@Autowired
	private FormationRepository repository;

	public Formation save( Formation entity) {
		return repository.save(entity);
	}

	public List<RecupNewFormation> findAll() {
		return ((List<Formation>)repository
				.findAll())
				.stream()
				.map(this::convertToFormation)
							.collect(Collectors.toList());
	}

	private RecupNewFormation convertToFormation(Formation formation) {
		RecupNewFormation recupNewFormation = new RecupNewFormation(
				formation.getId(),
				formation.getTitre(),
				formation.getDescription()
				);

		return recupNewFormation;
	}


	public List<Formation> findByTitre(String titre) {
		return repository.findByTitre(titre);
	}


	public Formation findById(Long id) {
		return repository.findById(id)
				.orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
	}





}
