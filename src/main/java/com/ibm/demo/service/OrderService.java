package com.ibm.demo.service;

import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;

@Service
public class OrderService { // spring bean 
	public String createOrder(Order order) {
		return "order created";
	}
	
	public String getOrder() {
		return "order read";
	}
	
	public String updateOrder(int orderId) {
		return "order updated";
	}
	
	public String deleteOrder(int orderId) {
		return "order deleted";
	}
}
