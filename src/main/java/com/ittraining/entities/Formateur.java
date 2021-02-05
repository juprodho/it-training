package com.ittraining.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "formateurs")
public class Formateur {
	
	
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		
		@Column(name = "nom")
		private String nom;

		@Column(name = "note")
		private int note;
		
		/*@ManyToMany
		@JoinTable(
				name = "formateur_has_eval_session",
				joinColumns = @JoinColumn(name = "formateur_id"),
				inverseJoinColumns = @JoinColumn(name = "eval_session_id"))*/
		//private List<eval_session> eval = new ArrayList<>();

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public int getNote() {
			return note;
		}

		public void setNote(int note) {
			this.note = note;
		}
		
		
		
		

	}