package com.hh;

public class Employee {
	private int id;
	private String name;
	private Address address;
	
	public Employee() {}
	
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}

	public Employee(int id, String name, Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void displayInfo() {
		System.out.println("Employee Id="+id+" and Name is: "+name);
		System.out.println(address);
	}
}
