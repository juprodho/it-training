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

import com.ittraining.entities.Session;
import com.ittraining.services.SessionService;

@RestController
@RequestMapping("sessions")
@CrossOrigin
public class SessionController {

	@Autowired
	private SessionService service;

	@GetMapping("titre/{titre}")
	public List<Session> findByTitre(@PathVariable String titre) {
		return service.findByTitre(titre);
	}

	@PostMapping("")
	public Session save(@RequestBody Session entity) {
		return service.save(entity);
	}

	@GetMapping("")
	public List<Session> findAll() {
		return service.findAll();
	}

	@GetMapping("{id}")
	public Session findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	
}
