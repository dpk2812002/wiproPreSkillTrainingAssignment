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

import com.example.com.movie.relations.model.Booking;
import com.example.com.movie.relations.service.BookingService;

@RestController
@RequestMapping("/api")
public class BookingController {
	@Autowired
	private BookingService bookingService;
	
	public BookingController(BookingService bookingService) {
		super();
		this.bookingService = bookingService;
	}


	@GetMapping("/api/booking")
	public List<Booking> getAllBookings(){
		return bookingService.getAllBookings();	
	}
	
	
	@GetMapping("/api/booking/{id}")
	public Optional<Booking> getBooking(@PathVariable Long id) {
		return bookingService.getBookingById(id);
	}
	
	
	@PostMapping("/api/booking")
	public ResponseEntity<Booking> createMovie(@RequestBody Booking booking) {
	    Booking savedBooking = bookingService.saveBooking(booking);
	    return new ResponseEntity<>(savedBooking, HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/api/booking/{id}")
    public void deleteMovie(@PathVariable Long id) {
		bookingService.deleteBooking(id);
    }

}
