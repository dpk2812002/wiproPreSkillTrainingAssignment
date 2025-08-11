package com.example.booking_service.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private Long movieId;
	    private Long theaterId;
	    private Long customerId;

	    private LocalDateTime showtime;
	    private int seats;
	    private double price;
	    private String paymentStatus;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getMovieId() {
			return movieId;
		}
		public void setMovieId(Long movieId) {
			this.movieId = movieId;
		}
		public Long getTheaterId() {
			return theaterId;
		}
		public void setTheaterId(Long theaterId) {
			this.theaterId = theaterId;
		}
		public Long getCustomerId() {
			return customerId;
		}
		public void setCustomerId(Long customerId) {
			this.customerId = customerId;
		}
		public LocalDateTime getShowtime() {
			return showtime;
		}
		public void setShowtime(LocalDateTime showtime) {
			this.showtime = showtime;
		}
		public int getSeats() {
			return seats;
		}
		public void setSeats(int seats) {
			this.seats = seats;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getPaymentStatus() {
			return paymentStatus;
		}
		public void setPaymentStatus(String paymentStatus) {
			this.paymentStatus = paymentStatus;
		}
		public Booking(Long id, Long movieId, Long theaterId, Long customerId, LocalDateTime showtime, int seats,
				double price, String paymentStatus) {
			super();
			this.id = id;
			this.movieId = movieId;
			this.theaterId = theaterId;
			this.customerId = customerId;
			this.showtime = showtime;
			this.seats = seats;
			this.price = price;
			this.paymentStatus = paymentStatus;
		}
		@Override
		public String toString() {
			return "Booking [id=" + id + ", movieId=" + movieId + ", theaterId=" + theaterId + ", customerId="
					+ customerId + ", showtime=" + showtime + ", seats=" + seats + ", price=" + price
					+ ", paymentStatus=" + paymentStatus + "]";
		}
		public Booking() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
	    
}
