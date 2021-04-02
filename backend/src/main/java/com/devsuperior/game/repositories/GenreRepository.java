package com.devsuperior.game.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.game.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
