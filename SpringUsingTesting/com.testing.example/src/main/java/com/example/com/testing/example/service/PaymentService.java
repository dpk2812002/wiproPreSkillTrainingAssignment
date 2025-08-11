package com.example.com.testing.example.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.com.testing.example.model.Order;
import com.example.com.testing.example.model.Payment;
import com.example.com.testing.example.repository.OrderRepository;
import com.example.com.testing.example.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
    private PaymentRepository paymentRepository;
    
    @Autowired
    private OrderRepository orderRepository;

    public Payment createPayment(Long orderId, Double amount) {
        Optional<Order> order = orderRepository.findById(orderId);
        if (!order.isPresent()) {
            throw new RuntimeException("Order not found");
        }
        
        Payment payment = new Payment();
        payment.setOrder(order.get());
        payment.setAmount(amount);
        payment.setStatus("Completed");
        payment.setPaymentDate(LocalDateTime.now());

        return paymentRepository.save(payment);
    }

}
