package com.ibm.demo.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Order {
	@NotNull
	@NotBlank
	private String item;
	private int id;
	private float price;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		if(price<=0) {
			throw new IllegalArgumentException("price cannot be negative");
		}
		this.price = price;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
}
