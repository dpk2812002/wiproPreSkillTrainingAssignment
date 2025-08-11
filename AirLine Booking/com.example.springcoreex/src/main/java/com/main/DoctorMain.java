package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.doctor.service.DoctorService;

public class DoctorMain {
	public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("DoctorBeans.xml");
		 
		 DoctorService service = (DoctorService) context.getBean("doctorService");
		 
		 String res= service.bookings("01", "2025-07-28");
		 System.out.println(res);
				 
		 
	}

}
