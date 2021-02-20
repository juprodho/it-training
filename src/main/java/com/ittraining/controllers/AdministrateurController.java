package com.ittraining.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ittraining.entities.Administrateur;
import com.ittraining.services.AdministrateurService;

@RestController
@RequestMapping("administrateurs")
@CrossOrigin
public class AdministrateurController {
	
	@Autowired
	private AdministrateurService service;
	
	@GetMapping("{id}")
	public Administrateur findById(@PathVariable Long id) {
		return this.service.findById(id);
	}
	
	@GetMapping("")
	public List<Administrateur> findAll() {
		return this.service.findAll();
	}
	
	@PostMapping("inscription")
	public Administrateur save(@RequestBody Administrateur entity) {
		return this.service.save(entity);
	}
		
	@PostMapping("login")
	public Administrateur findByEmailAndMotDePasse(@RequestBody String email, String motDePasse) {
		return this.service.findByEmailAndMotDePasse(email, motDePasse);
	}
	

}
