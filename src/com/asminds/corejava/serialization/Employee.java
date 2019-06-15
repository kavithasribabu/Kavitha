package com.asminds.corejava.serialization;

import java.io.Serializable;

public class Employee implements Serializable{

	int id;
	String name;
	String salary;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
