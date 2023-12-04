package com.microservice.listagames.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.listagames.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
