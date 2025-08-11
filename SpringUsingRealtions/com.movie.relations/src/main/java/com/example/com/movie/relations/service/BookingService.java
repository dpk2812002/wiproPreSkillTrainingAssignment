package com.example.com.movie.relations.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.com.movie.relations.model.Booking;
import com.example.com.movie.relations.repository.BookingRepository;

@Service
public class BookingService {
	
	
	@Autowired
	private BookingRepository bookingRepository;

	
	
	public List<Booking> getAllBookings(){
		return bookingRepository.findAll();
	}
	
	public Optional<Booking> getBookingById(Long id) {
		return bookingRepository.findById(id);	
	}
	
	public Booking saveBooking(Booking booking) {
		return bookingRepository.save(booking);
	}
	
	public void deleteBooking(Long id) {
		bookingRepository.deleteById(id);
	}

}
