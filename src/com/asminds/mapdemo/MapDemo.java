package com.asminds.mapdemo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, Employee> m=new ConcurrentHashMap<>();
		m.put(10, new Employee(101, "sudha"));
		m.put(20, new Employee(109, "hema"));
		m.put(15,  new Employee(103, "nandhu"));
		
		for(Map.Entry<Integer, Employee> map:m.entrySet()) {
			m.put(13,  new Employee(103, "nandhu"));
			System.out.println(map.getKey() +" " +map.getValue());
		}
		
		
	}
}
