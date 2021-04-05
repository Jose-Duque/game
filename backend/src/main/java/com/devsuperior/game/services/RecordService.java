package com.devsuperior.game.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.game.entities.Game;
import com.devsuperior.game.entities.Record;
import com.devsuperior.game.entities.dto.RecordDTO;
import com.devsuperior.game.entities.dto.RecordInsertDTO;
import com.devsuperior.game.repositories.GameRepository;
import com.devsuperior.game.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public Page<RecordDTO> findAll(Instant minDate, Instant maxDate, PageRequest pageRequest) {
		return repository.findByMoment(minDate, maxDate, pageRequest).map(x -> new RecordDTO(x));
	}
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Game game = gameRepository.getOne(dto.getGameId());
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		entity.setGame(game);
		entity = repository.save(entity);
		return new RecordDTO(entity);
	}
}
