package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Address;
import com.model.Customer;

public class CustomerMain {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Customer cust = (Customer) context.getBean("Customer");
		
		System.out.println(cust.getName());
		
		Address add= context.getBean(Address.class);
		System.out.println(add.getPincode());
	}

}
