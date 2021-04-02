package com.devsuperior.game.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.game.entities.Game;
import com.devsuperior.game.entities.dto.GameDTO;
import com.devsuperior.game.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameDTO> findAll() {
		List<Game> game = repository.findAll();
		return game.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
	}
}
