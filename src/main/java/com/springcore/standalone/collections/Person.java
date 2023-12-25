package com.springcore.standalone.collections;

import java.util.*;

public class Person {
	private List<String> friends;
	private Map<String,Integer> fees;
	private Properties properties;
	
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", fees=" + fees + ", properties=" + properties + "]";
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	public Map<String, Integer> getFees() {
		return fees;
	}

	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Person(List<String> friends) {
		super();
		this.friends = friends;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
