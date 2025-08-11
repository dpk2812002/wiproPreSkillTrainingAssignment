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

import com.example.com.movie.relations.model.Customer;
import com.example.com.movie.relations.service.CustomerService;


@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}


	@GetMapping("/api/customer")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();	
	}
	
	
	@GetMapping("/api/customer/{id}")
	public Optional<Customer> getMovie(@PathVariable Long id) {
		return customerService.getCustomerById(id);
	}
	
	
	@PostMapping("/api/customer")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
	    Customer savedCustomer = customerService.saveCustomer(customer);
	    return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/api/customer/{id}")
    public void deleteMovie(@PathVariable Long id) {
		customerService.deleteCustomer(id);
    }


}
