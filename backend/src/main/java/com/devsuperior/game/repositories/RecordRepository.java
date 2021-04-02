package com.devsuperior.game.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.game.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
