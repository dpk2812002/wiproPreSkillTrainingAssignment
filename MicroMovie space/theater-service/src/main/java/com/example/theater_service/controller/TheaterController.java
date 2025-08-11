package com.example.theater_service.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.theater_service.model.Theater;
import com.example.theater_service.service.TheaterService;

@RestController
@RequestMapping("/api/theaters")
public class TheaterController {
	
	@Autowired
	TheaterService theaterService;

	  @GetMapping
	    public List<Theater> getAllTheaters() {
	        return theaterService.getAllTheaters();
	    }
	  
	  @GetMapping("/{id}")
	    public Optional<Theater> getTheater(@PathVariable Long id) {
	        return theaterService.getTheaterById(id);
	    }
	  
	  @PostMapping
	    public Theater createTheater(@RequestBody Theater theater) {
	        return theaterService.saveTheater(theater);
	    }
	  
	  @PutMapping("/{id}")
	    public Theater updateTheater(@PathVariable Long id, @RequestBody Theater theater) {
	        theater.setId(id);
	        return theaterService.saveTheater(theater);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteTheater(@PathVariable Long id) {
	    	theaterService.deleteTheater(id);
	    }	  
}
