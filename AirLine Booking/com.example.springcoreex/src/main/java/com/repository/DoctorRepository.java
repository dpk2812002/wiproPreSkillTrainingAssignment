package com.repository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoctorRepository {
	
	private Map<String, List<LocalDate>> Schedule;
	
	public DoctorRepository() {
		
		Schedule = new HashMap<>();
		Schedule.put("01", Arrays.asList(
            LocalDate.of(2025, 07, 31),
            LocalDate.of(2025, 8, 01)            
        ));
				
	}
	
	public boolean Available(String DId, LocalDate date) {
		List<LocalDate> open = Schedule.get(DId);
	return open.contains(date);
		
	}
	

}
