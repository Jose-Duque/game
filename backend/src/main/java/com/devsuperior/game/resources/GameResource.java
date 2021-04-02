package com.devsuperior.game.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.game.entities.Game;
import com.devsuperior.game.entities.dto.GameDTO;
import com.devsuperior.game.repositories.GameRepository;
import com.devsuperior.game.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameResource {

	@Autowired
	private GameService service;
	
	@GetMapping
	public ResponseEntity<List<GameDTO>> findAll() {
		List<GameDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
