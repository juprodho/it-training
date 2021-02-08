package com.ittraining.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.ittraining.entities.Admin;
import com.ittraining.repositories.AdminRepository;

public class AdminService {

	@Autowired
	private AdminRepository repository;

	public Admin save(Admin entity) {
		return repository.save(entity);
	}

	public List<Admin> findAll() {
		return repository.findAll();
	}

	public List<Admin> findByNom(String nom) {
		return repository.findByNom(nom);
	}

	public List<Admin> findByPrenom(String prenom) {
		return repository.findByPrenom(prenom);
	}

	public List<Admin> findByMail(String mail) {
		return repository.findByMail(mail);
	}

	public List<Admin> findByTel(String tel) {
		return repository.findByTel(tel);
	}

	public List<Admin> findByPassword(String password) {
		return repository.findByPassword(password);
	}

	public Admin findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

	}

}
