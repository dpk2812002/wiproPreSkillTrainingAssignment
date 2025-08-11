package com.doctor.service;

import java.time.LocalDate;

import com.repository.DoctorRepository;

public class DoctorService {
	private DoctorRepository doctorRepository;
	
	public DoctorService() {
  
    }

	public void setDoctorRepository(DoctorRepository doctorRepository) {
		this.doctorRepository = doctorRepository;
	}
	
	
	public String bookings(String DId, String dates) {
		LocalDate date= LocalDate.parse(dates);
		
		if(doctorRepository.Available(DId, date)) {
			return "Confirmed";
			
		}else {
			return "Not Confirmed";
		}
	}
	
	

}
