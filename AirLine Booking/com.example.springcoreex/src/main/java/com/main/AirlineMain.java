package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.doctor.service.TicketService;

public class AirlineMain {
	
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("airlineBeans.xml");
        TicketService ticketService = (TicketService) context.getBean("ticketService");

        String result1 = ticketService.confirmBooking("FL123", "USER456");
        System.out.println(result1);

        String result2 = ticketService.confirmBooking("FL123", "USER789");
        System.out.println(result2);

        String result3 = ticketService.confirmBooking("FL123", "USER999");
        System.out.println(result3);
    }

}
