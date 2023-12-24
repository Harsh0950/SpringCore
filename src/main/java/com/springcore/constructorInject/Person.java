package com.springcore.constructorInject;

public class Person {
	private String name;
	private int personid;
	private Certificate certi;
	public Person(String name, int personid, Certificate certi) {
		super();
		this.name = name;
		this.personid = personid;
		this.certi = certi;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personid=" + personid + ", certi=" + certi + "]";
	}
}
