package com.ittraining.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ittraining.dto.RecupNewFormation;
import com.ittraining.entities.Formation;
import com.ittraining.services.FormationService;

@RestController
@RequestMapping("formations")
@CrossOrigin
public class FormationController {

	@Autowired
	private FormationService service;
	
	@GetMapping("")
	public List<RecupNewFormation> findAll(){
		List<RecupNewFormation> recupNewFormations = service.findAll();	
		return recupNewFormations;
	}
	
	@PostMapping("")
	public Formation save(@RequestBody Formation entity) {
		return this.service.save(entity);
	}
	
	
	
	@GetMapping("titre/{titre}")
	public List<Formation> findByTitre(@PathVariable String titre) {
		return service.findByTitre(titre);
	}
	

	@GetMapping("{id}")
	public Formation findById(@PathVariable Long id) {
		return service.findById(id);
	}

	
	
	
}