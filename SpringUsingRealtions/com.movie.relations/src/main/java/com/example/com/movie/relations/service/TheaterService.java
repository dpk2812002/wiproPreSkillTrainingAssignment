package com.example.com.movie.relations.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.com.movie.relations.model.Theater;
import com.example.com.movie.relations.repository.TheaterRepository;

@Service
public class TheaterService {

	@Autowired
	private TheaterRepository theaterRepository;
	

	public TheaterService(TheaterRepository theaterRepository) {
		super();
		this.theaterRepository = theaterRepository;
	}
	

	public List<Theater> getAllTheaters(){
		return theaterRepository.findAll();
	}
	
	public Optional<Theater> getTheaterById(Long id) {
		return theaterRepository.findById(id);	
	}
	
	public Theater saveTheater(Theater theater) {
		return theaterRepository.save(theater);
	}
	
	public void deleteTheater(Long id) {
		theaterRepository.deleteById(id);
	}
	
}
