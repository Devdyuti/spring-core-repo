package org.spring.core.practice;

public class Employee {
	
	private static Employee instance =new Employee();
	
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
		this.id = id;
		this.name = name;
		System.out.println("Employee invoked");
	}
	private Employee() {
		System.out.println("Employee default constructor");
	}
	public static Employee getInstance() {
		if(instance==null) {
			return new Employee();
		}else {
			return instance;
		}
	}
	
	
	
}
