package com.example.com.movie.relations.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.com.movie.relations.model.Booking;
@DataJpaTest
@AutoConfigureTestDatabase 
class BookingRepositoryTest {
	
	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void Bookingtest() {
		
		Booking b= new Booking() ;
		b.setSeats(2);
		
		Booking rs = bookingRepository.save(b);
		
		assertEquals(2, rs.getSeats());
	}

}
