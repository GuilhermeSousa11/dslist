package com.gsdevsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsdevsuperior.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
