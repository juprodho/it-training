package com.ittraining.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import com.ittraining.entities.Formation;
import com.ittraining.repositories.FormationRepository;

@Service
public class FormationService {

	@Autowired
	private FormationRepository repository;

	public List<Formation> findByTitre(String titre) {
		return repository.findByTitre(titre);
	}

	public List<Formation> findByDescription(String description) {
		return repository.findByDescription(description);
	}

	public List<Formation> findAll() {
		return repository.findAll();
	}

	public Formation findById(Long id) {
		return repository.findById(id)
				.orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
	}

	public Formation save(@RequestBody Formation entity) {
		return repository.save(entity);
	}
	
	
	
}
