package com.example.com.movie.relations.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.com.movie.relations.model.Theater;
import com.example.com.movie.relations.service.TheaterService;

@RestController
@RequestMapping("/api")
public class TheaterController {
	@Autowired
	private TheaterService theaterService;
	
	public TheaterController(TheaterService theaterService) {
		super();
		this.theaterService = theaterService;
	}
	


	@GetMapping("/api/theater")
	public List<Theater> getAllTheaters(){
		return theaterService.getAllTheaters();
	}
	
	
	@GetMapping("/api/theater/{id}")
	public Optional<Theater> getMovie(@PathVariable Long id) {
		return theaterService.getTheaterById(id);
	}
	
	
	@PostMapping("/api/theater")
	public ResponseEntity<Theater> createCustomer(@RequestBody Theater theater) {
	    Theater savedCustomer = theaterService.saveTheater(theater);
	    return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
	}
	
	
	
	@DeleteMapping("/api/theater{id}")
    public void deleteMovie(@PathVariable Long id) {
		theaterService.deleteTheater(id);
    }

}
