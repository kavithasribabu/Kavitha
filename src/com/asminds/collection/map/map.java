package com.asminds.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class map {
public static void main(String[] args) {
	Map<Integer,String> m =new HashMap<Integer,String>();
	m.put(1,"kavi");
	m.put(2, "pavi");
	for(Map.Entry map:m.entrySet())
	{
		System.out.println(map.getKey()+" "+map.getValue());
	}
	
	}
}