package com.ittraining.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ittraining.entities.Admin;
import com.ittraining.services.AdminService;

public class AdminController {

	@Autowired
	private AdminService service;

	@PostMapping("")
	public Admin save(@RequestBody Admin entity) {
		return this.service.save(entity);
	}

	@GetMapping("nom/{nom}")
	public List<Admin> findByNom(@PathVariable String nom) {
		return service.findByNom(nom);
	}

	@GetMapping("prenom/{prenom}")
	public List<Admin> findByPrenom(@PathVariable String prenom) {
		return service.findByPrenom(prenom);
	}

	@GetMapping("mail/{mail}")
	public List<Admin> findByMail(@PathVariable String mail) {
		return service.findByMail(mail);
	}

	@GetMapping("password/{passord}")
	public List<Admin> findByPassword(@PathVariable String password) {
		return service.findByPassword(password);
	}

	@GetMapping("{id}")
	public Admin findById(@PathVariable Long id) {
		return service.findById(id);
	}

}
