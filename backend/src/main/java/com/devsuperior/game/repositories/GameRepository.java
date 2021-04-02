package com.devsuperior.game.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.game.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
