package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		
		List<GameMinDTO> dto = gameRepository.findAll()
				.stream()
				.map(game -> new GameMinDTO(game))
				.toList();
		
		return dto;
		
	}

}
