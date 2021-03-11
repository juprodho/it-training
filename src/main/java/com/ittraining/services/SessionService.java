package com.ittraining.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.ittraining.dto.SessionDTO;
import com.ittraining.entities.Session;
import com.ittraining.repositories.SessionRepository;

@Service
public class SessionService {
	
	@Autowired
	private SessionRepository repository;

	public Session save(Session entity) {
		return repository.save(entity);
	}

	public List<SessionDTO> findAll() {
		return ((List<Session>) repository
				.findAll())
				.stream()
				.map(this::convertToSessionDto)
				.collect(Collectors.toList());
	}

	public Session findById(Long id) {
		return repository.findById(id)
				.orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	public SessionDTO findByIdToDTO(Long id) {
		Session session = this.findById(id);
		SessionDTO sessionDTO = this.convertToSessionDto(session);
		return sessionDTO;
	}
	
	private SessionDTO convertToSessionDto(Session session) {
		SessionDTO sessionDto = new SessionDTO();
		sessionDto.setId(session.getId());
		sessionDto.setDateDebut(session.getDate_debut());
		sessionDto.setDateFin(session.getDate_fin());
		sessionDto.setPrix(session.getPrix());
		sessionDto.setLieu(session.getLieu());
		return sessionDto;
	}	
	
	
}
