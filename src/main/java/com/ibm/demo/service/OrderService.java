package com.ibm.demo.service;

import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;

@Service
public class OrderService { // spring bean 
	public String createOrder(Order order) {
		return "order created";
	}
}
