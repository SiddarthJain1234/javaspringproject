package com.springcore;

public class Address {
	
	private String city;
	
	
	
	
	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}


	public Address() {
		// TODO Auto-generated constructor stub
	}


	public Address(String city) {
		super();
		this.city = city;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}
