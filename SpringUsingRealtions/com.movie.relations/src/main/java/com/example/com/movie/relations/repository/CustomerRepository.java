package com.example.com.movie.relations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.com.movie.relations.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
