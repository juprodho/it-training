package com.ittraining.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Session {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="numero")
	private Integer numero;
	
	@Column(name="date_debut")
	private Date dateDebut;
	
	@Column(name="date_fin")
	private Date dateFin;
	
	@Column(name="prix")
	private String prix;
	
	@Column(name="note_formateur")
	private Integer noteFormateur;
	
	@Column(name="nombre_participant")
	private Integer nombreParticipant;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public Integer getNoteFormateur() {
		return noteFormateur;
	}
	public void setNoteFormateur(Integer noteFormateur) {
		this.noteFormateur = noteFormateur;
	}
	public Integer getNombreParticipant() {
		return nombreParticipant;
	}
	public void setNombreParticipant(Integer nombreParticipant) {
		this.nombreParticipant = nombreParticipant;
	}
	
	
	
}
