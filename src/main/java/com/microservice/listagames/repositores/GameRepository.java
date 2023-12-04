package com.microservice.listagames.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.listagames.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
