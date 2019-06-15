package com.asminds.corejava.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) throws IOException {
		Employee emp=new Employee(10,"nandhinee");
		
		FileOutputStream f=new FileOutputStream("test.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(emp);
		o.flush();
		System.out.println("Successss");
	}
}
