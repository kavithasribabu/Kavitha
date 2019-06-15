package com.asminds.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream f=new FileInputStream("test.txt");
		ObjectInputStream o=new ObjectInputStream(f);
		
		Employee e=(Employee) o.readObject();
		System.out.println(e.id +" " +e.name);
		o.close();
		
	}
}
