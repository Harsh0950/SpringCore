package com.springcore.constructorInject;

public class Certificate {
	String name;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Certificate [name=" + name + "]";
	}
	
}
