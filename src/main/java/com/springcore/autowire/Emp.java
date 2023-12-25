package com.springcore.autowire;

public class Emp {	
	private Address address;

	public Address getAddress() {
		return address;
	}

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
