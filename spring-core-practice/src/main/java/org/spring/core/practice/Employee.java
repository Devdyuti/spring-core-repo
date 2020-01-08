package org.spring.core.practice;

public class Employee {
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		return "Hello "+name;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//constructor
	
}
