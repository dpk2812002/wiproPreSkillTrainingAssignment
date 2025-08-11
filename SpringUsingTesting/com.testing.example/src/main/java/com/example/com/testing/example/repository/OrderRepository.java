package com.example.com.testing.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.com.testing.example.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
