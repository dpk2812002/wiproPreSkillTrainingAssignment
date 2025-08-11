package com.example.com.testing.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.com.testing.example.exception.CustomerNotFoundException;

public class ExceptionController {
	
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<String> customerNotFound(CustomerNotFoundException ex){
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

}
