package com.example.com.movie.relations.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.com.movie.relations.model.Customer;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CustomerRepositoryTest {
	
	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void Customertest() {
		
		Customer c= new Customer();
		c.setName("Pavan");
		
		Customer res = customerRepository.save(c);
		
		assertEquals(res.getName(), "Pavan");
	}

}
