package com.example.booking_service.controller;

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

import com.example.booking_service.model.Booking;
import com.example.booking_service.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public Optional<Booking> getBooking(@PathVariable Long id) {
        return bookingService.getBookingById(id);
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.saveBooking(booking);
    }

    @PutMapping("/{id}")
    public Booking updateBooking(@PathVariable Long id, @RequestBody Booking booking) {
        booking.setId(id);
        return bookingService.saveBooking(booking);
    }

    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Long id) {
    	bookingService.deleteBooking(id);
    }

    @GetMapping("/customer/{customerId}")
    public List<Booking> getBookingsByCustomer(@PathVariable Long customerId) {
        return bookingService.getBookingsByCustomerId(customerId);
    }
	
	
	
}
