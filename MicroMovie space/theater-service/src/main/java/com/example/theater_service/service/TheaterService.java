package com.example.theater_service.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.theater_service.model.Theater;
import com.example.theater_service.repository.TheaterRepository;

@Service
public class TheaterService {

	@Autowired
	TheaterRepository theaterRepository;
	
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
