package com.devsuperior.game.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.game.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}