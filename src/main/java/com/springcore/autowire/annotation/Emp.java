package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired
	@Qualifier("address")
	public void setAddress(Address address) {
		System.out.println("setting value");
		this.address = address;
	}
	public Emp() {
		super();
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	public Emp(Address address) {
		super();
		System.out.println("constructor calling");
		this.address = address;
	}
}
