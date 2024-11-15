package com.gsdevsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsdevsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
