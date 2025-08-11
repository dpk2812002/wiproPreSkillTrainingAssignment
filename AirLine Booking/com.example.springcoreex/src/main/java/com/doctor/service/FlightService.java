package com.doctor.service;

import java.util.HashMap;
import java.util.Map;

public class FlightService {

	private Map<String, Integer> availableSeats = new HashMap<>();

    public FlightService() {
        availableSeats.put("FL123", 2);
        availableSeats.put("FL456", 0);
    }
    
    public boolean isSeatAvailable(String flightId) {
        Integer seats = availableSeats.get(flightId);
        return seats != null && seats > 0;
    }
    
    public void bookSeat(String flightId) {
        if (isSeatAvailable(flightId)) {
            availableSeats.put(flightId, availableSeats.get(flightId) - 1);
        }
    
    
    }
}
