package com.ittraining.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.ittraining.entities.Administrateur;
import com.ittraining.repositories.AdministrateurRepository;

@Service
public class AdministrateurService {
	
	@Autowired
	private AdministrateurRepository repository;
	
	public Administrateur save(Administrateur entity) {
		return this.repository.save(entity);
	}
	
	public List<Administrateur> findAll() {
		return this.repository.findAll();
	}
	
	public Administrateur findById(Long id) {
		return this.repository.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	public Administrateur findByEmailAndMotDePasse(String email, String motDePasse) {
		return this.repository.findByEmailAndMotDePasse(email, motDePasse);
	}
	
	public void deleteById(Long id) {
		this.repository.deleteById(id);
	}
	
	public Administrateur update(Administrateur administrateur, Long id) {
		return this.repository.updateAdministrateur(administrateur, id);
	}

}
