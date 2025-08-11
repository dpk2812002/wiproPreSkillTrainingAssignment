package com.example.customer_service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer_service.model.Customer;
import com.example.customer_service.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin("*")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	
	@GetMapping
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomers();
	}

	@PostMapping
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	@GetMapping("/{id}")
	public Optional<Customer> getCustomerById(@PathVariable Long id) {
		return customerService.getCustomerById(id);
	
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer, @PathVariable Long id) {
	    Optional<Customer> existingCustomerOpt = customerService.getCustomerById(id);
	    
	    if (existingCustomerOpt.isPresent()) {
	        Customer existingCustomer = existingCustomerOpt.get();
	        existingCustomer.setName(customer.getName());
	        existingCustomer.setPassword(customer.getPassword());
	        existingCustomer.setEmail(customer.getEmail());

	        Customer updatedCustomer = customerService.saveCustomer(existingCustomer);
	        return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
	
	

	@DeleteMapping("/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		customerService.deleteCustomer(id);
		return "Customer deleted with this "+id;
	}
	
	
	
	@GetMapping("/byNameAndEmail/{name}")
	public Customer getCustomerByName(@PathVariable String name, @RequestParam String email) {
		return customerService.getCustomerByNameAndEmail(name,email);
	}
	
	@GetMapping("/byNameStarts/{prefix}")
	public List<Customer> getCustomerByNameStartsWith(@PathVariable String prefix) {
		return customerService.getCustomerByNameStartsWith(prefix);
	}
	
	@GetMapping("/byCountNameStarts/{prefix}")
	public long countCustomerByNameStartsWith(@PathVariable String prefix) {
		return customerService.countCustomerByNameStartsWith(prefix);
	}
	
	@GetMapping("/byDomain/{domain}")
	public List<Customer> getCustomersByDomain(@PathVariable String domain) {
		return customerService.getCustomersByDomain(domain);
	}
	
	@GetMapping("/minAgeCustomer")
	public Customer getMinAgeCustomer() {
		return customerService.getMinAgeCustomer();
	}
	
}
