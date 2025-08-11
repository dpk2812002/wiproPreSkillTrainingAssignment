package com.example.com.testing.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.com.testing.example.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
