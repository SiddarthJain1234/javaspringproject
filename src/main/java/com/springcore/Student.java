package com.springcore;

public class Student {

	private String name;
	private int rollno;
	
	
	private Address address;
	private Tution tution;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
		
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", address=" + address + ", tution=" + tution + "]";
	}



//	public Student(String name, int rollno, Address address, Tution tution) {
//		super();
//		this.name = name;
//		this.rollno = rollno;
//		this.address = address;
//		this.tution = tution;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Tution getTution() {
		return tution;
	}
	public void setTution(Tution tution) {
		this.tution = tution;
	}
	
	public void start(){
		System.out.println("initialized");
	}
	
	public void stop() {
		System.out.println("Stopped");
	}
	


}
