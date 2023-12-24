package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jalebi {
	private double price;

	public Jalebi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jalebi [price=" + price + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("inside jalebi init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("inside jalebi destroy method");
	}
}
