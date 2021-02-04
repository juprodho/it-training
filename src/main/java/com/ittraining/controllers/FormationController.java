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

import com.ittraining.entities.Formation;
import com.ittraining.services.FormationService;

@Controller
@RequestMapping("formations")
@CrossOrigin
public class FormationController {

	@Autowired
	private FormationService service;

	@GetMapping("titre/{titre}")
	public List<Formation> findByTitre(@PathVariable String titre) {
		return service.findByTitre(titre);
	}

	@GetMapping("description/{description}")
	public List<Formation> findByDescription(@PathVariable String description) {
		return service.findByDescription(description);
	}

	@GetMapping("")
	public List<Formation> findAll() {
		return service.findAll();
	}

	@GetMapping("{id}")
	public Formation findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("")
	public Formation save(@RequestBody Formation entity) {
		return service.save(entity);
	}
	
	
}
