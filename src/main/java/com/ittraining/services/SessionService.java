package com.ittraining.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.ittraining.entities.Session;
import com.ittraining.repositories.SessionRepository;

@Service
public class SessionService {
	
	@Autowired
	private SessionRepository repository;

	public List<Session> findByTitre(String titre) {
		return repository.findByTitre(titre);
	}

	public Session save(Session entity) {
<<<<<<< HEAD
		
		int numero = 0;
=======
>>>>>>> ilias
		return repository.save(entity);
	}

	public List<Session> findAll() {
		return repository.findAll();
	}

	public Session findById(Long id) {
		return repository.findById(id)
				.orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	
	
}
