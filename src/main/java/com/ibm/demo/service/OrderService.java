package com.ibm.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;
import com.ibm.demo.repo.OrderRepository;

@Service
public class OrderService { // spring bean 
	@Autowired
	OrderRepository orderRepository;
	public String createOrder(Order order) {
		Order savedOrder = orderRepository.save(order);
		return savedOrder.getId();
	}
	
	public Order getOrder(int orderId) {
		return new Order();
	}
	
	public List<Order> getOrders() {
		return new ArrayList<Order>();
	}
	
	public void updateOrder(int orderId) {
		
	}
	
	public void deleteOrder(int orderId) {
		System.out.println("order deleted");
	}

}
