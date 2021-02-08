package com.ittraining.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ittraining.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
	
	public List<Admin> findByNom(String nom);
	
	public List<Admin> findByPrenom(String prenom);
	
	public List<Admin> findByMail(String mail);
	
	public List<Admin> findByTel(String tel);
	
	public List<Admin> findByPassword(String password);

}
